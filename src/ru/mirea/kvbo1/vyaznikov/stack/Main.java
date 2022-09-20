package ru.mirea.kvbo1.vyaznikov.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nStack tests:\n");
        stackTest();

    }

    public static void stackTest() {
        System.out.println("Test1:");
        StackInterface stack = new MyStack(3);
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("\nTest2:");
        try {
            System.out.println("Trying to get element from empty stack");
            stack.getTop();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepted exception: " + e);
        }
        System.out.println("\nTest3:");
        stack.push(1);
        System.out.println("Size: " + stack.size() + "\nTop:" + stack.getTop());

        System.out.println("\nTest4:");
        stack.push(2);
        stack.push(3);
        try {
            stack.push(4);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Trying to get element from empty stack");
            System.out.println("Excepted exception: " + e);
        }
        System.out.println("\nTest5:");
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("\nTest6:");
        stack.pop();
        System.out.println("Size: " + stack.size() + "\nTop:" + stack.getTop());
        System.out.println("\nTest7:");
        stack.pop();
        stack.pop();
        try {
            stack.pop();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Trying to delete element from empty stack");
            System.out.println("Excepted exception: " + e);
        }
    }
}