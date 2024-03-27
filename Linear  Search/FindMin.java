public class FindMin {
    public static void main(String[] args) {
        int [] nums = {23,6,42,75,84,36,25,33,74,24,88};
        System.out.println(min(nums));
    }
    static int min(int []arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] <ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
