package BT_11;

import java.util.Scanner;

public class DateValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập ngày: ");
            int day = scanner.nextInt();

            System.out.print("Nhập tháng: ");
            int month = scanner.nextInt();

            System.out.print("Nhập năm: ");
            int year = scanner.nextInt();

            if (isValidDate(day, month, year)) {
                System.out.println("Ngày tháng năm hợp lệ.");
            } else {
                throw new Exception("Ngày tháng năm không hợp lệ.");
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    // Phương thức kiểm tra tính hợp lệ của ngày tháng năm
    public static boolean isValidDate(int day, int month, int year) {
        if (year <= 0) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        if (day < 1 || day > getDaysInMonth(month, year)) {
            return false;
        }

        return true;
    }

    // Phương thức lấy số ngày trong tháng
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    // Phương thức kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
