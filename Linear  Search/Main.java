public class Main {
    public static void main(String[] args) {

        int [] nums = {23,6,42,75,84,36,25,33,74,24,88};
        int target = 74;
        Boolean element = linearseach3(nums,target);
        System.out.println(element);

    }




    static int linearseach(int [ ] arr, int target){
        if (arr.length == 0){
            return  -1;
        }

        for (int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return  i;
            }
        }
        return -1;
    }

    static int linearseach2(int [ ] arr, int target){
        if (arr.length == 0){
            return  -1;
        }

        for (int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return  arr[i];
            }
        }
        return -1;
    }

    static  boolean linearseach3(int [ ] arr, int target){
        if (arr.length == 0){
            return  false;
        }

        for (int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return  true;
            }
        }
        return false;
    }
}
