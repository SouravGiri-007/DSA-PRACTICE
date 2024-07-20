
class findKthRotation {
    public static int findRotation(int []arr) {
                int low = 0,high = arr.length-1;
        while(low< high)
        {
            int mid = low + (high-low)/2;
            if(arr.length > arr.length )low = mid+1;
            else high = mid;
        }
        return  low;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findRotation(arr);
        System.out.println("The array is rotated " + ans + " times.");
    }
}
 
