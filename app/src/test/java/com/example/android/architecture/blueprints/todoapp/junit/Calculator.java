package com.example.android.architecture.blueprints.todoapp.junit;

/**
 * Created by lee on 16/8/25.
 */
public class Calculator {
    public int add(int one, int another) {
        // 为了简单起见，暂不考虑溢出等情况。
        return one + another;
    }

    public int multiply(int one, int another) {
        // 为了简单起见，暂不考虑溢出等情况。
        return one * another;
    }

    public double divide(double divident, double dividor) {
        if (dividor == 0) throw new IllegalArgumentException("Dividor cannot be 0");

        return divident / dividor;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(1, 2);
        if(sum == 3) {
            System.out.println("add() works!");
        } else {
            System.out.println("add() does not works!");
        }

        int product = calculator.multiply(2, 4);
        if (product == 8) {
            System.out.println("multiply() works!");
        } else {
            System.out.println("multiply() does not works!");
        }
    }
}