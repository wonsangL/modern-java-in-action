package ch_05;

import javafx.util.Pair;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapping {
    List<Integer> firstList = Arrays.asList(1, 2, 3);
    List<Integer> secondList = Arrays.asList(3, 4);

    @Test
    public void quiz_5_2_2() {
        List<Pair<Integer, Integer>> results = firstList.stream()
                .flatMap(element -> setPair(element, secondList))
                .collect(Collectors.toList());

        results.forEach(result -> System.out.println("( " + result.getKey() + ", " + result.getValue() + " )"));
    }

    private static Stream<Pair<Integer, Integer>> setPair(Integer item, List<Integer> inventory) {
        List<Pair<Integer, Integer>> result = new ArrayList<>();

        for (Integer element : inventory) {
            result.add(new Pair<>(item, element));
        }

        return result.stream();
    }

    @Test
    public void quiz_5_2_3() {
        List<Pair<Integer, Integer>> results = firstList.stream()
                .flatMap(element -> setPair(element, secondList))
                .filter(pair -> (pair.getKey() + pair.getValue()) % 3 == 0 )
                .collect(Collectors.toList());

        results.forEach(result -> System.out.println("( " + result.getKey() + ", " + result.getValue() + " )"));
    }
}
