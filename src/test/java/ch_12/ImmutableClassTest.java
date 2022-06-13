package ch_12;

import org.junit.Test;

public class ImmutableClassTest {
    @Test
    public void immutableClassTest() {
        String name = "wonsang";
        String copy = name;

        System.out.println(name == copy);

        name = "hyunhee";

        System.out.println(name == copy);
    }
}
