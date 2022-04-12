package ch_03;

import common.Apple;
import common.Color;
import org.junit.Assert;
import org.junit.Test;

public class MemoryAccessTest {
    @Test
    public void multi_thread_access_test() {
        Thread thread = new Thread(() -> {
            System.out.println("outer thread start!!");
            Apple apple = new Apple();
            apple.setColor(Color.RED);
            apple.setWeight(10);

            Thread internalThread = new Thread(() -> {
                try {
                    Thread.sleep(3000);
                    System.out.println("inner thread start!!");
                    Assert.assertEquals(Color.RED, apple.getColor());
                    System.out.println("inner thread end!!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "inner thread");

            internalThread.start();
            System.out.println("outer thread end!!");
        } , "outer thread");

        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
