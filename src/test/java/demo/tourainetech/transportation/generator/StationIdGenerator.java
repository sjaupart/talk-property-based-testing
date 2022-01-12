package demo.tourainetech.transportation.generator;

import com.google.auto.service.AutoService;
import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;
import demo.tourainetech.transportation.StationId;

@AutoService(Generator.class)
public class StationIdGenerator extends Generator<StationId> {

    public StationIdGenerator() {
        super(StationId.class);
    }

    @Override
    public StationId generate(SourceOfRandomness random, GenerationStatus status) {
        return new StationId(random.nextInt());
    }
}
