package ru.mirea.kvbo1.vyaznkov;

public class Math {
    public static int factorial(int firstNumber) {
        int result = 1;
        for (int i = firstNumber; i > 1; i--) {
            result *= i;
        }
        return result;
    }

    public static double[] firstTenHarmonicNumbers() {
        double[] numbers = new double[10];
        for (int i = 1; i < 11; i++) {
            numbers[i - 1] = 1.0 / i;
        }
        return numbers;
    }
}