package BT_15;

import java.util.Scanner;

public class TriangleValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập độ dài cạnh thứ nhất: ");
            double side1 = scanner.nextDouble();
            System.out.print("Nhập độ dài cạnh thứ hai: ");
            double side2 = scanner.nextDouble();
            System.out.print("Nhập độ dài cạnh thứ ba: ");
            double side3 = scanner.nextDouble();

            validateTriangle(side1, side2, side3);

            System.out.println("Các cạnh tạo thành một tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static void validateTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Các cạnh phải là số dương.");
        }

        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại.");
        }
    }
}
