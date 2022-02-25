package ch_04;

import common.Apple;
import common.Color;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperation {
    @Test
    public void streamOperationTest() {
        List<Apple> inventory = initInventory();

        List<Apple> filtered = inventory.stream()
                .filter(apple -> apple.getColor() == Color.RED)
                .filter(apple -> apple.getWeight() > 10)
                .collect(Collectors.toList());

        class Temp {

        }

        Assert.assertEquals(Color.RED, filtered.get(0).getColor());
        Assert.assertEquals(100, filtered.get(0).getWeight(), 1);
    }

    private List<Apple> initInventory() {
        List<Apple> result = new ArrayList<>();

        Apple redApple = new Apple();
        redApple.setColor(Color.RED);
        redApple.setWeight(10);

        result.add(redApple);

        Apple redHeavyApple = new Apple();
        redHeavyApple.setColor(Color.RED);
        redHeavyApple.setWeight(100);

        result.add(redHeavyApple);

        Apple greenApple = new Apple();
        greenApple.setColor(Color.GREEN);
        greenApple.setWeight(10);

        result.add(greenApple);

        return result;
    }
}
