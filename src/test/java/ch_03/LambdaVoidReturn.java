package ch_03;

import org.junit.Test;

import java.util.function.Consumer;

public class LambdaVoidReturn {
    @Test
    public void lambdaVoidTest() {
        Consumer<Integer> intConsumer = (Integer a) -> a.intValue();

//        Consumer<Integer> integerConsumer = (Integer a) -> a; compile error

        Consumer<Boolean> booleanConsumer = (Boolean b) -> b.booleanValue();

//        Consumer<Boolean> booleanClassConsumer = (Boolean b) -> b; compile error
    }
}
