package ch_05;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Exercise {
    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario", "Milan");
    Trader alan = new Trader("Alan", "Cambridge");
    Trader brian = new Trader("Brian", "Cambridge");

    List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    @Test
    public void quiz_1() {
        List<Transaction> result = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());

        Assert.assertEquals(2, result.size());
        Assert.assertEquals(300, result.get(0).getValue());
        Assert.assertEquals(400, result.get(1).getValue());
    }

    @Test
    public void quiz_2() {
        List<String> result = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());

        result.forEach(System.out::println);

        Assert.assertEquals(2, result.size());
    }

    @Test
    public void quiz_3() {
        List<Trader> result = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());

        result.forEach(System.out::println);

        Assert.assertEquals(4, result.size());
    }

    @Test
    public void quiz_4() {
        List<Trader> result = transactions.stream()
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());

        result.forEach(System.out::println);

        Assert.assertEquals("Alan", result.get(0).getName());
    }

    @Test
    public void quiz_5() {
        boolean result = transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(trader -> trader.getCity().equals("Milano"));

        Assert.assertFalse(result);
    }

    @Test
    public void quiz_6() {
        int result = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .mapToInt(Transaction::getValue)
                .sum();

        Assert.assertEquals(2650, result);
    }

    @Test
    public void quiz_7() {
        OptionalInt result = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .mapToInt(Transaction::getValue)
                .max();

        if (!result.isPresent()) {
            Assert.fail();
        }

        Assert.assertEquals(1000, result.getAsInt());
    }

    @Test
    public void quiz_8() {
        OptionalInt result = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .mapToInt(Transaction::getValue)
                .min();

        if (!result.isPresent()) {
            Assert.fail();
        }

        Assert.assertEquals(300, result.getAsInt());
    }
}
