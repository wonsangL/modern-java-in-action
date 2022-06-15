package ch_13;

public interface A {
    void emptyMethod();

    default void duplicatedMethod() {
        System.out.println("this is A interface!");
    }
}
