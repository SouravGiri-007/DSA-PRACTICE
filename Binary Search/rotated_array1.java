/*problem = https://rb.gy/ayvxda */


import java.util.Scanner;

public class rotated_array1 {
    public static int search(int [] nums, int target){
        int low = 0,high = nums.length - 1;
        
        while (low<=high) {
            int mid = (low+high)/2;
            if(nums[mid]==target) return mid;

            if(nums[low]<nums[mid]){
                if(nums[low]<=target && nums[mid]>target){
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            else{
                if (nums[mid]<target && nums[high] >=target) {
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            
        }
        return -1;
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
        int ans = search(arr,k);
        if(ans > -1){
            System.out.println("The given element was found at the index: " + ans);
        }
        else{
            System.out.println("Element not found");
        }

        sc.close();
    }
}
