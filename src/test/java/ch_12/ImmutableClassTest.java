package ch_12;

import org.junit.Test;

public class ImmutableClassTest {
    @Test
    public void immutableClassTest() {
        String name = "hello";
        String copy = name;

        System.out.println(name == copy);

        copy += " world";

        System.out.println(name == copy);
    }
}
