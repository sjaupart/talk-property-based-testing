package demo.pbt.transportation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BusCapacityTest {

    @Test
    void capacity_must_be_between_10_and_50() {
        assertThatThrownBy(() -> new BusCapacity(9)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new BusCapacity(51)).isInstanceOf(IllegalArgumentException.class);

        assertThatCode(() -> new BusCapacity(10)).doesNotThrowAnyException();
        assertThatCode(() -> new BusCapacity(50)).doesNotThrowAnyException();
    }
}