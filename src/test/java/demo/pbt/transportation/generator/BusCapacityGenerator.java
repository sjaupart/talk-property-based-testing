package demo.pbt.transportation.generator;

import com.google.auto.service.AutoService;
import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;
import demo.pbt.transportation.BusCapacity;

@AutoService(Generator.class)
public class BusCapacityGenerator extends Generator<BusCapacity> {

    public BusCapacityGenerator() {
        super(BusCapacity.class);
    }

    @Override
    public BusCapacity generate(SourceOfRandomness random, GenerationStatus status) {
        var validCapacity = random.nextInt(10, 50);
        return new BusCapacity(validCapacity);
    }
}
