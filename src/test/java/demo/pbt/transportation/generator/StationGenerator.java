package demo.pbt.transportation.generator;

import com.google.auto.service.AutoService;
import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;
import demo.pbt.transportation.Station;
import demo.pbt.transportation.StationId;

@AutoService(Generator.class)
public class StationGenerator extends Generator<Station> {

    public StationGenerator() {
        super(Station.class);
    }

    @Override
    public Station generate(SourceOfRandomness random, GenerationStatus status) {
        return new Station(
                gen().type(StationId.class).generate(random, status)
        );
    }
}
