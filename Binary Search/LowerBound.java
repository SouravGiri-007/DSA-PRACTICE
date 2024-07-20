import java.util.Scanner;

public class LowerBound {
    static int findFloor(long arr[], int n, long x) {
        int start = 0;
        int end = n - 1;
        int ans = -1;  
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] <= x) {
                ans = mid;  
                start = mid + 1; 
            } else {
                end = mid - 1;  
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizeof Array: ");
        int n = sc.nextInt();
        long arr[] = new long[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        long k = sc.nextInt();
        int ans = findFloor(arr,n,k);
        if(ans > -1){
            System.out.println("The given element was found at the index: " + ans);
        }
        else{
            System.out.println("Element not found");
        }

        sc.close();
    }

}
