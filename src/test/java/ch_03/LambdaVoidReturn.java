package ch_03;

import org.junit.Test;

import java.util.function.Consumer;

public class LambdaVoidReturn {
    @Test
    public void lambdaVoidTest() {
        Consumer<Integer> intConsumer = (a) -> a.intValue();

//        Consumer<Integer> integerConsumer = (a) -> a; compile error

        Consumer<Boolean> booleanConsumer = (b) -> b.booleanValue();

//        Consumer<Boolean> booleanClassConsumer = (b) -> b; compile error
    }
}
