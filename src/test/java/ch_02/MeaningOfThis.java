package ch_02;

import org.junit.Test;

public class MeaningOfThis {
    public final int value = 4;

    @Test
    public void doIt() {
        int value = 6;
        Runnable r = new Runnable() {
            public final int value = 5;
            @Override
            public void run() {
                int value = 10;
                System.out.println(value); //정답은?
            }
        };

        r.run();
    }
}
