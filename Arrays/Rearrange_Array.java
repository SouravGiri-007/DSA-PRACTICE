import java.util.Scanner;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] extra = new int[nums.length];
        int p1 = 0;  
        int p2 = 1;  
        
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                 
                extra[p2] = nums[i];
                p2 += 2;  
            } else {
                 
                extra[p1] = nums[i];
                p1 += 2;  
            }
        }
        return extra;
    }
}

public class Rearrange_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

         
        System.out.println("Enter the elements (positive and negative integers):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

         
        Solution solution = new Solution();
        
        
        int[] rearrangedArray = solution.rearrangeArray(nums);

        
        System.out.println("Rearranged array:");
        for (int num : rearrangedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}


