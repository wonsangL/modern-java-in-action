package ch_09;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;

public class FilterTest {
    @Test
    public void testFilter() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> even = filter(numbers, i -> i % 2 == 0);
        assertEquals(Arrays.asList(2, 4), even);
    }

    private <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();

        for (T item : list) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }

        return result;
    }

    @Test
    public void printLambdaStackTraceTest() {
        Function<Integer, Integer> divideByZero = i -> i / 0;
        divideByZero.apply(10);
    }
}
