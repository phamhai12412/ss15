package BT_10;

import java.util.Scanner;


public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius;
        do {
            System.out.print("Nhập bán kính hình tròn: ");
            radius = scanner.nextDouble();

            if (radius < 0) {
                System.out.println("Lỗi: Bán kính không được âm. Vui lòng nhập lại.");
            }
        } while (radius < 0);

        double area = calculateCircleArea(radius);
        System.out.println("Diện tích hình tròn là: " + area);
    }

    // Phương thức tính diện tích hình tròn
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
