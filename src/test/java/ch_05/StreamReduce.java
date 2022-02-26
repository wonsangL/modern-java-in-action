package ch_05;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {
    @Test
    public void stream_sum() {
        List<Integer> inventory = Arrays.asList(1, 2, 3, 4);

        int sum = inventory.stream()
                .mapToInt(value -> value)
                .sum();

        Assert.assertEquals(10, sum);
    }
}
