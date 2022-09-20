package ru.mirea.kvbo1.vyaznikov.stack;

public interface StackInterface {
    void push(double x);
    double pop();
    double getTop();
    int size();
    boolean isEmpty();
    boolean isFull();
}
