package ch_03;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.function.Consumer;

public class LambdaException {
    @Test
    public void exceptionHandlingTest() {
        Consumer<String> errConsumer = (String fileName) -> {
            try {
                FileReader reader = new FileReader(fileName);

                int ch;
                while ((ch = reader.read()) != 1) {
                    System.out.println((char) ch);
                }
            } catch (IOException e) {
                System.out.println("ERROR occur!!");
                e.printStackTrace();
            }
        };

        errConsumer.accept("invalidFileName");

        ExceptionThrowFunction<String> errFunction = (String fileName) -> {
            FileReader reader = new FileReader(fileName);

            int ch;
            while ((ch = reader.read()) != 1) {
                System.out.println((char) ch);
            }
        };

        try {
            errFunction.apply("invalidFileName");
        } catch (IOException e) {
            System.out.println("ERROR occur!!");
            e.printStackTrace();
        }
    }
}
