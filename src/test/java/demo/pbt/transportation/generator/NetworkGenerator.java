package demo.pbt.transportation.generator;

import com.google.auto.service.AutoService;
import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;
import demo.pbt.transportation.Bus;
import demo.pbt.transportation.Network;
import demo.pbt.transportation.Station;
import demo.pbt.transportation.Weather;

import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

@AutoService(Generator.class)
public class NetworkGenerator extends Generator<Network> {

    public NetworkGenerator() {
        super(Network.class);
    }

    @Override
    public Network generate(SourceOfRandomness random, GenerationStatus status) {
        var stations = randomCollection(Station.class, random, status);
        var buses = randomCollection(Bus.class, random, status);
        var weather = gen().type(Weather.class).generate(random, status);

        return new Network(stations, buses, weather);
    }

    private <T> Set<T> randomCollection(Class<T> clazz, SourceOfRandomness random, GenerationStatus status) {
        return Stream
                .generate(() -> gen().type(clazz).generate(random, status))
                .limit(5)
                .collect(toSet());
    }
}
