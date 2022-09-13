package ru.mirea.kvbo1.vyaznikov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Circles: \n");
        circles();
        System.out.println("\nArrays with for: \n");
        forArray();
        System.out.println("\nArrays with while: \n");
        whileArray();
        System.out.println("\nMath: \n");
        math();
        System.out.println("\nCommand line: \n");
        commandLine(args);
        System.out.println("\nArrayList:\n");
        arrayList();
        System.out.println("\nStack tests:");
        stackTest();

    }

    public static void circles() {
        Circle firstCircle = new Circle(10, 0, 0, "white");
        firstCircle.printAllInfo();
        firstCircle.setRadius(5);
        firstCircle.printAllInfo();
    }

    public static void forArray() {
        double[] arr = {0, 1, 2, 3, 4, 5};
        MyArray firstArr = new MyArray(arr);
        System.out.println(firstArr.averageNumber() + " " + firstArr.getSum());
    }

    public static void whileArray() {
        Scanner input = new Scanner(System.in);

        System.out.println("Type array size: ");
        int size = input.nextInt();
        double[] arr = new double[size];
        System.out.println("Type " + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextDouble();
        }

        MyArray firstArr = new MyArray(arr);
        System.out.println("Minimum: " + firstArr.getMinimum() + "\nMaximum: " + firstArr.getMaximum() +
                "\nSum: " + firstArr.getSumWhile());

    }

    public static void math() {
        double[] harmonicNumbers = Math.firstTenHarmonicNumbers();
        System.out.print("Factorial: " + Math.factorial(3) + "\nHarmonic numbers: ");
        for (double harmonicNumber : harmonicNumbers) {
            System.out.print(String.format("%.3f", harmonicNumber) + " ");
        }
    }

    public static void commandLine(String[] arguments) {
        System.out.println("Arguments: ");
        for (String argument : arguments) {
            System.out.println(argument);
        }
    }

    public static void arrayList() {
        ArrayList<Circle> circles = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle(random.nextInt(1, 100), 0, 0, "white");
            circles.add(circle);
        }
        CircleComparator circleCompare = new CircleComparator();
        circles.sort(circleCompare);
        for (Circle circle : circles) {
            System.out.println(circle);
        }
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