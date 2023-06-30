package BT_12;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số nguyên a: ");
            int a = scanner.nextInt();

            System.out.print("Nhập số nguyên b: ");
            int b = scanner.nextInt();

            if (a == 0 && b == 0) {
                throw new Exception("Lỗi: Cả hai số đều bằng 0.");
            }

            int gcd = findGreatestCommonDivisor(a, b);
            System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + gcd);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    // Phương thức tìm ước chung lớn nhất
    public static int findGreatestCommonDivisor(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
