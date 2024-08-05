import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {

        int [] arr = {3,7,2,9,4,6};
        sort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void sort (int[] arr,int low,int hi){
            if (low>=hi) {
                return;
            }
            int s = low;
            int e = hi;
            int mid = s + (e - s)/2;
            int pivot = arr[mid];

            while (s<=e) {
                while (arr[s]<pivot) {
                        s++;
                }
                while (arr[e]>pivot) {                    
                        e--;                   
                }
                if (s<=e) {
                    int temp = arr[s];
                    arr[s] = arr[e];
                    arr[e] = temp;
                    s++;
                    e--;
                }
            }
            // for (int i = 0; i < arr.length; i++) {
            //     System.out.println(arr[i]);
            // }
            sort(arr, low, e);
            sort(arr, s, hi);
        }
}
