


package BT_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        try {
            System.out.print("Nhập số nguyên thứ nhất: ");
            int num1 = scanner.nextInt();
            System.out.print("Nhập số nguyên thứ hai: ");
            int num2 = scanner.nextInt();

            sum = num1 + num2;
            System.out.println("Tổng của hai số nguyên là: " + sum);

        } catch (Exception e) {
            System.out.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên. Vui lòng nhập lại!\n");

            main(args);
        } finally {
            scanner.close();
        }


    }
}