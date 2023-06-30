package BT_09;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Lỗi: n phải là số nguyên dương.");
            } else {
                int fibonacciNumber = calculateFibonacci(n);
                System.out.println("Số Fibonacci thứ " + n + " là: " + fibonacciNumber);
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static int calculateFibonacci(int n) {
        if (n <= 2) {
            return 1;
        }

        int fib1 = 1;
        int fib2 = 1;
        int fibonacciNumber = 0;

        for (int i = 3; i <= n; i++) {
            fibonacciNumber = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacciNumber;
        }
        System.out.println(fibonacciNumber);
        return fibonacciNumber;
    }
}
