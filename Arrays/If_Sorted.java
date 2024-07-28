import java.util.Scanner;

public class If_Sorted {
    public static boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        if (nums[0] < nums[n - 1]) {
            count++;
        }
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
            if (count > 1) return false;
        }
        return true;
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

         boolean result = check(nums);
        if (result) {
            System.out.println("The array is sorted  .");
        } else {
            System.out.println("The array is not sorted  ");
        }

        scanner.close();
    }
}
