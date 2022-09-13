package ru.mirea.kvbo1.vyaznikov;

public class MyStack implements StackInterface {
    private final double[] elements;
    private int top;
    private final int maxCapacity;


    public MyStack(int size) {
        elements = new double[size];
        maxCapacity = size;
        top = -1;
    }


    public void push(double element) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("Stack is fully filled");
        }
        elements[++top] = element;
        System.out.println("Added " + element);
    }

    public double pop() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        return elements[top--];
    }

    public double getTop() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        return elements[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top+1 == maxCapacity;
    }
}
