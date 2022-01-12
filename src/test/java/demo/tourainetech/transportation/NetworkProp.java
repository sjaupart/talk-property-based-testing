package demo.tourainetech.transportation;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class NetworkProp {

    @Property
    public void network(Network network) {
        System.out.println(network);
        // nothing
    }
}
