class Solution {

  public  static int firstOccurance(int[] nums, int n ,int x){
      int low = 0 ,high = n-1;
      int first = -1;

      while(low <= high){
        int mid = low + (high - low) / 2;

          if(nums[mid] == x){
              first = mid;
              high = mid - 1;
          }else if(nums[mid] < x){
              low = mid + 1;
          }else{
              high = mid - 1;
          }
      }

      return first;
  }


  public static int lastOccurance(int[] nums,int n ,int x){
      int low = 0 ,high = n-1;
      int last = -1;

      while(low <= high){
          int mid = (low + high)/2;

          if(nums[mid] == x){
              last = mid;
              low = mid + 1;
          }else if(nums[mid] < x){
              low = mid + 1;
          }else{
              high = mid - 1;
          }
      }

      return last;

  }
  public static int[] searchRange(int[] nums, int target) {
      int n = nums.length; 
      int first = firstOccurance(nums,n,target);

      if(first == -1) return new int[] {-1,-1};
      
      int last = lastOccurance(nums,n,target);

      return new int[] {first , last};
  }

    public static void main(String[] args) {



        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 =  searchRange(nums1, target1);
        System.out.println("First occurrence of " + target1 + " in nums1: " + result1[0]);
        System.out.println("Last occurrence of " + target1 + " in nums1: " + result1[1]);
    }

}