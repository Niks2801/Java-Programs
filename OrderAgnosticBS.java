public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3; 

        int result = orderAgnosticBinarySearch(arr, target);
        System.out.println("Element found at index: " + result);
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}