//problem link: https://shorturl.at/P35qq
public class Sort_color {
    public static void sortColors(int[] nums) {
        int n = nums.length;  
        int low = 0, mid = 0, high = n - 1; 

        while (mid <= high) { 
            if (nums[mid] == 0) { 
                swap(nums, low, mid);  
                low++;  
                mid++;   
            } else if (nums[mid] == 1) {  
                mid++;  
            } else {  
                swap(nums, mid, high);  
                high--; 
            }
        }
    }

    private static void swap(int[] nums, int i, int j) { 
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp; 
    }

    public static void main(String[] args) { 
        
        int[] nums = {2, 0, 2, 1, 1, 0}; 

        System.out.println("Before sorting:");
        printArray(nums); 

        sortColors(nums); 

        System.out.println("After sorting:");
        printArray(nums);  
    }

    public static void printArray(int[] nums) { 
        for (int num : nums) { 
            System.out.print(num + " "); 
        }
        System.out.println(); 
    }
}

