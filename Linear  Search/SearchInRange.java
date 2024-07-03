public class SearchInRange {
    public static void main(String[] args) {
        int [] nums = {13,354,26,73,83,64,36,12,6};
        int target = 73;
        System.out.println(search(nums, target, 3, 5));
    }

    static int search(int[] arr, int target,int start,int end){
        if(arr.length == 0)
        {
            return -1;
        }
        for(int index= start; index <end; index++)
        {
            int element = arr[index];
            if (element == target) 
            {
                return index;
            }
        }
        
        return -1;
    }
    
}
