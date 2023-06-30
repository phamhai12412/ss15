package BT_03;

import java.sql.SQLOutput;

public class SumNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int sum = 0;
        try {
            System.out.println("Tính tổng mảng số nguyên");
            for (Integer num : arr) {
                sum += num;

            }
            System.out.println("Tổng: " +sum);
        } catch (Exception e) {

        }
    }
}
