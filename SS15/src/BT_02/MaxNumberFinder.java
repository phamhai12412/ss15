package BT_02;

public class MaxNumberFinder {
    public static int findMaxNumber(int[] arr) throws Exception {
        if (arr.length == 0) {
            throw new IllegalArgumentException("mảng rỗng");
        }
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {};
        try {
            int maxNumber = findMaxNumber(numbers);
            System.out.println("Số lớn nhất trong mảng là: " + maxNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
