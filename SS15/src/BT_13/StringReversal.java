package BT_13;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập chuỗi: ");
            String input = scanner.nextLine();

            if (isInvalidString(input)) {
                throw new Exception("Lỗi: Chuỗi không hợp lệ.");
            }

            String reversedString = reverseString(input);
            System.out.println("Chuỗi đảo ngược: " + reversedString);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    // Phương thức kiểm tra tính hợp lệ của chuỗi
    public static boolean isInvalidString(String str) {
        return str == null || str.isEmpty();
    }

    // Phương thức đảo ngược chuỗi
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
