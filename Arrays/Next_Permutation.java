// problem link = "https://leetcode.com/problems/next-permutation/description/"

public class Next_Permutation {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;

        if (n == 0 || nums == null) return;

        int k = n - 2;

        while (k >= 0 && nums[k] >= nums[k + 1]) {
            k--;
        }

        if (k == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        int l = n - 1;
        while (nums[l] <= nums[k]) {
            l--;
        }

        int temp = nums[k];
        nums[k] = nums[l];
        nums[l] = temp;

        reverse(nums, k + 1, n - 1);
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 5};
        nextPermutation(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
