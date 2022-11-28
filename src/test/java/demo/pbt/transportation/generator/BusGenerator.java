package demo.pbt.transportation.generator;

import com.google.auto.service.AutoService;
import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;
import demo.pbt.transportation.Bus;

@AutoService(Generator.class)
public class BusGenerator extends Generator<Bus> {

    public BusGenerator() {
        super(Bus.class);
    }

    @Override
    public Bus generate(SourceOfRandomness random, GenerationStatus status) {
        return gen().constructor(Bus.class, Integer.class).generate(random, status);
    }
}
