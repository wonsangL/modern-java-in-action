package ch_02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    @Test
    public void quiz_01() {
        Apple apple = new Apple();
        apple.setColor(Color.RED);
        apple.setWeight(100.0f);

        List<Apple> inventory = new ArrayList<>();
        inventory.add(apple);

        prettyPrintApple(inventory,
                item -> String.format("Apple color: %s, wight: %f", item.getColor().name(), item.getWeight()));
    }

    private void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for (Apple apple : inventory) {
            System.out.println(formatter.format(apple));
        }
    }
}
