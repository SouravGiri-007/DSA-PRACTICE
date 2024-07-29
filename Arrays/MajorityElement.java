import java.util.Scanner;

 

public class MajorityElement {


	public static int findElement(int[] nums) {
        int count = 0;  
        int candidate = 0;  
        
        for (int num : nums) {  
            if (count == 0) {  
                candidate = num;
            }
            if (candidate == num) { 
                count++;  
            } else {
                count--;  
            }
        }
        
        return candidate;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
         
        int[] nums = new int[n];
        
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        
       
        int majorityElement =  findElement(nums);
        
        
        System.out.println("The majority element is: " + majorityElement);
        
        scanner.close();
    }
}
