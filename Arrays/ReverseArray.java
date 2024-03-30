import java.util.Scanner;

class ReverseArray{

    static void ReverseElement(int[] arr,int i,int j){
        int temp;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
    }

    static void printArray(int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter array size: ");
        n = sc.nextInt();
        int [] arr = new int [n];

        System.out.println("Enter Array element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("your Array is: ");
        printArray(arr);

        ReverseElement(arr,0, n-1);
        System.out.println("After reverse this Array is: ");

        printArray(arr);


        sc.close();
    }
   
}