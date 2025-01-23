package array;

public class binarySearch {

    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    binarySearch obj = new binarySearch();
        int[] arr = new int[]{1,10,12,15,34,68,72,77,81};
        System.out.println(obj.search(arr, 82));
    }
}
