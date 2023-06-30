package BT_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, m = 0;
        boolean input = false;
        while (!input) {
            try {
                System.out.print("Nhập số thứ nhất: ");
                n = Integer.parseInt(scanner.nextLine());
                input = true;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Giá trị không phải số nguyên. Vui lòng nhập lại.");
            }
        }
        input = false;
        while (!input) {
            try {
                System.out.print("Nhập số thứ hai: ");
                m = Integer.parseInt(scanner.nextLine());
                input = true;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Giá trị không phải số nguyên. Vui lòng nhập lại.");
            }
        }
        int num = Math.max(n, m);
        System.out.println("Số lớn nhất là: " + num);
    }


}
