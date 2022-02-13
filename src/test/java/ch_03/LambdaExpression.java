package ch_03;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class LambdaExpression {
    @Test
    public void lambdaExpressionTest() {
        ToIntFunction<String> stringToInt = Integer::parseInt;
        BiPredicate<List<String>, String> contains = List::contains;
        Predicate<String> startWithNumber = LambdaExpression::startWithNumber;

        Assert.assertTrue(startWithNumber("1"));
        Assert.assertFalse(startWithNumber("a"));
    }

    private static boolean startWithNumber(String s) {
        for (int i = 0; i <= 9; ++i) {
            if (s.startsWith(Integer.toString(i))) {
                return true;
            }
        }
        return false;
    }
}
