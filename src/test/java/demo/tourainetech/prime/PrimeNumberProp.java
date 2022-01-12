package demo.tourainetech.prime;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.When;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import java.math.BigInteger;

import static org.junit.Assert.assertTrue;

@RunWith(JUnitQuickcheck.class)
public class PrimeNumberProp {

    @Property(shrink = false)
    public void number_is_prime(@InRange(minInt = 2) int number) {
        assertTrue(isPrime(number));
    }

    private boolean isPrime(int value) {
        return BigInteger.valueOf(value).isProbablePrime(100);
    }
}
