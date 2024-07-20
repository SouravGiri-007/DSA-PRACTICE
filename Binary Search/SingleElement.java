public class SingleElement {
    public static int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];
    }


    public static void main(String[] args) {
        //Solution solution = new Solution();


        int[] nums1 = {1, 1, 2, 3, 3, 4, 4};
        System.out.println("The single non-duplicate element is: " + singleNonDuplicate(nums1));
    }
}
