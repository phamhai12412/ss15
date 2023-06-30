package BT_05;

public class BinarySearch {
    public static void BinarySearch(int[] arr, int value) throws Exception {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                System.out.println("Found at index " + mid);
                return;
            } else if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        throw new Exception("Not found");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        try {
            BinarySearch(arr, 6);

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
