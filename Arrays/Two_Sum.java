import java.util.Scanner;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
       return new int[]{}; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

         int[] nums = new int[size];

         System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter the target sum:");
        int target = scanner.nextInt();
        
        int[] result = twoSum(nums, target);
        
        System.out.println("\"Indices of the elements that add up to the target are:" + result[0] +  "and"  + result[1]);

        scanner.close();
    }
}
