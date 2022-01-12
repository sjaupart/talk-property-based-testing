package demo.tourainetech.transportation.generator;

import com.google.auto.service.AutoService;
import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;
import demo.tourainetech.transportation.Weather;

@AutoService(Generator.class)
public class WeatherGenerator extends Generator<Weather> {

    public WeatherGenerator() {
        super(Weather.class);
    }

    @Override
    public Weather generate(SourceOfRandomness random, GenerationStatus status) {
        return gen().type(Weather.class).generate(random, status);
    }
}
