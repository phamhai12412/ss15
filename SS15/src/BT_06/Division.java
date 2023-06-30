package BT_06;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số bị chia: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhập số chia: ");
        int num2 = scanner.nextInt();

        try {
            int result = divide(num1, num2);
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Số chia không được bằng 0.");
        }
    }

    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Số chia không được bằng 0.");
        }

        return num1 / num2;
    }
}
