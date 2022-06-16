package ch_16;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {
    @Test
    public void test() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
                return 0;
            } catch (Exception e) {
                return -1;
            }
        });

        try {
            long start = System.currentTimeMillis();
            Thread.sleep(1000);
            Integer result = future.get();
            long end = System.currentTimeMillis();

            System.out.println(end - start);
        } catch (Exception e) {
            throw new IllegalStateException();
        }
    }
}
