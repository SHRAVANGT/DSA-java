package array;

public class linearSearch {

    public boolean search(int[] nums, int target) {
        int n = nums.length;
        System.out.println(n);
    for (int i = 0; i < n; i++) {
        if (nums[i] == target) {
            return true;
        }
        System.out.println(i);
    }
    return false;
    }

public static void main(String[] args) {
    linearSearch obj = new linearSearch();
    int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
    System.out.println(obj.search(arr, 0));
}
}
