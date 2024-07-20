/*problem = http://rb.gy/c5m136 */


import java.util.Scanner;

public class rotated_array2 {
    public static boolean search(int [] nums, int target){
        int low =0, high = nums.length-1;

        while(low<=high){

            int mid = low + (high-low)/2;

            if(nums[mid]==target) return true;

            if(nums[low]==nums[mid]&& nums[mid]==nums[high]) {
                low++;
                high--;
                continue;
            }

            else if (nums[low]<= nums[mid]){

                if(target>=nums[low] && target<= nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{

                if(target>=nums[mid] && target<=nums[high]){
                    low= mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return false;

        
    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizeof Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int k = sc.nextInt();
        boolean ans = search(arr,k);
        
        System.out.println(ans);

        sc.close();
    }
}
