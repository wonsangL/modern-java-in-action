package ch_03;

import java.io.IOException;
import java.util.function.Function;

@FunctionalInterface
public interface ExceptionThrowFunction<T> {
    void apply(T fileName) throws IOException;
}
