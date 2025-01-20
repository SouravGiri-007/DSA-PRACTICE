class Solution {
    public int[] twoSum(int[] arr, int sum) {
        int start = 0, end = arr.length - 1;
        
        while(start < end) {   
            int currentSum = arr[start] + arr[end];   
            
            if(currentSum == sum) {
                return new int[] {start + 1, end + 1};
            }
            
            if(currentSum > sum) {
                end--;
            } else {
                start++;
            }
        }
        
       
        return new int[] {0, 0};   
    }
}