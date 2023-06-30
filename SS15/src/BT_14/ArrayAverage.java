package BT_14;

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số phần tử của mảng: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                throw new Exception("Lỗi: Kích thước mảng không hợp lệ.");
            }

            int[] array = new int[size];
            System.out.println("Nhập các phần tử của mảng:");

            for (int i = 0; i < size; i++) {
                System.out.print("Phần tử thứ " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

            double average = calculateAverage(array);
            System.out.println("Giá trị trung bình của mảng là: " + average);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    // Phương thức tính giá trị trung bình của mảng
    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Lỗi: Mảng không có phần tử nào.");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }
}
