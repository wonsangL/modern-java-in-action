package ch_03;

import org.junit.Test;

public class LambdaVariableAccess {
    private int field = 10;

    @Test
    public void variableAccessTest() {
        int localVariable = 10;

        Runnable runnable = () -> {
            System.out.println("field: " + field);
            System.out.println("local variable: " + localVariable);
        };

        runnable.run();

        field = 11;

        runnable.run();

//        localVariable = 11;
//        localVariable = new Player(2); compile error
    }

    private class Player {
        public int id;

        public Player(int id) {
            this.id = id;
        }
    }
}
