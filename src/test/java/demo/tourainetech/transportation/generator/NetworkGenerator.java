package demo.tourainetech.transportation.generator;

import com.google.auto.service.AutoService;
import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;
import demo.tourainetech.transportation.Bus;
import demo.tourainetech.transportation.Network;
import demo.tourainetech.transportation.Station;
import demo.tourainetech.transportation.Weather;

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
        var stations = randomList(Station.class, random, status);
        var buses = randomList(Bus.class, random, status);
        var weather = gen().type(Weather.class).generate(random, status);

        return new Network(stations, buses, weather);
    }

    private <T> Set<T> randomList(Class<T> clazz, SourceOfRandomness random, GenerationStatus status) {
        return Stream
                .generate(() -> gen().type(clazz).generate(random, status))
                .limit(10)
                .collect(toSet());
    }
}
