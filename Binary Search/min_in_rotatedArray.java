import java.util.Arrays;

public class min_in_rotatedArray {
     
        public static  int findMin(int[] nums) {
         int s = 0; 
         int e = nums.length -1;
         while(s < e){
             int m= s+ (e - s)/2;
             if(nums[m]>nums[e]) s = m+1;
             else if(nums[m] < nums[e]) e =m;
             else e--;
         }
         return nums[s];
      }
      public static void main(String[] args) {



    int[] nums1 = {3, 4, 5, 1, 2};
    int minElement1 =  findMin(nums1);
    System.out.println("Minimum element in array " + Arrays.toString(nums1) + " is: " + minElement1);

}
}