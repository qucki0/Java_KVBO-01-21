package ru.mirea.kvbo1.vyaznikov;

import java.util.Arrays;

public class MyArray {
    private double[] numbers;

    public MyArray(double[] numbers) {
        this.numbers = numbers;
    }

    public double getSum() {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public double getSumWhile() {
        int i = 0;
        int sum = 0;
        while (i < numbers.length) {
            sum += numbers[i];
            i += 1;
        }
        return sum;
    }

    public double getMinimum() {
        double min = numbers[0];
        for (double number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public double getMaximum() {
        double max = numbers[0];
        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public double averageNumber() {
        return getSum() / numbers.length;
    }

    public double[] getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }

    public void setNumbers(double[] numbers) {
        this.numbers = numbers;
    }
}
