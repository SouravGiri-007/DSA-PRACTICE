//package Arrays;

// https://www.naukri.com/code360/problems/find-unique_625159
public class FindUniqueElement {

    public static void main(String[] args) {
        int[] arr = {3,5,3,5,7};
        int ans = findunique(arr);
        System.out.println(ans);


    }

    static int findunique(int [] arr)
    {


        int ans = 0;

        for (int j : arr) {
            ans = ans ^ j;
        }
        return ans;
    }

}
