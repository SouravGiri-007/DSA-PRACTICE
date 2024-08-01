import java.util.Arrays;

public class longestConsecutive {
     public static  int longestlength(int[] nums) {
        int n = nums.length;
        if(n== 0) return 0;

        Arrays.sort(nums);
        int lastsmaller = Integer.MIN_VALUE;
        int count = 0;
        int longest  = 1;


                for (int i = 0; i < n; i++) {
            if (nums[i] - 1 == lastsmaller) {
                count += 1;
                lastsmaller = nums[i];
            } else if (nums[i] != lastsmaller) {
                count = 1;
                lastsmaller = nums[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
	

	public static void main(String[] args) {

        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestlength(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }

}
