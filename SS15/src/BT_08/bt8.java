package BT_08;

import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        try {
            int num = scanner.nextInt();
            if (isPrime(num)) {
                System.out.println(num + "là số nguyên tố" +"");
            }else {
                System.out.println(num + " Không phải là số nguyên tố");
            }
        }catch (Exception e){
            System.out.println("lỗi " + e.getMessage());

        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
