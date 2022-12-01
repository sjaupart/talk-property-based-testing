package demo.pbt.transportation;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class BusCapacity {

    private static final int MINIMUM_CAPACITY = 10;
    private static final int MAXIMUM_CAPACITY = 50;

    private Integer value;

    public BusCapacity(Integer value) {
        if (value < MINIMUM_CAPACITY || value > MAXIMUM_CAPACITY) {
            throw new IllegalArgumentException(
                    "Bus capacity must be between %s and %s".formatted(MINIMUM_CAPACITY, MAXIMUM_CAPACITY)
            );
        }
        this.value = value;
    }
}
