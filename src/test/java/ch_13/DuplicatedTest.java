package ch_13;

import org.junit.Test;

public class DuplicatedTest {
    @Test
    public void duplicatedInterfaceTest() {
        C c = new C();
        c.emptyMethod();
    }

    static class C implements A, B {
        @Override
        public void emptyMethod() {
            System.out.println("this is C class!");
        }
    }
}
