package demo.pbt.transportation;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Set;

@AllArgsConstructor
@ToString
public class Network {

    private Set<Station> stations;
    private Set<Bus> buses;
    private Weather weather;
}
