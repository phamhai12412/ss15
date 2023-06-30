package BT_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number = new ArrayList<>();

        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            try {
                int num = Integer.parseInt(String.valueOf(str.charAt(i)));
                number.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Có một ký tự không phải số nguyên. Đã được thay thế bằng 0.");
                number.add(0);
            }
        }
        System.out.println("Danh sách số nguyên: " + number);

    }

}
