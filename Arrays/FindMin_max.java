import java.util.Scanner;

public class FindMin_max {

    static int  getMin(int [] arr){

        int min;
        min = arr[0];
            for (int i = 0; i < arr.length; i++) 
            {
                if (min > arr[i])
                {
                    min = arr[i];
                }
            }
        return min;
    }

    static int getMax(int[]arr){
        int max = arr[0];
            for (int i = 0; i < arr.length; i++) 
            {
                if (max < arr[i])
                {
                    max = arr[i];
                }
            }
            return max;
        }


    static void printArray(int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[] = new int[5]; 
        Scanner n = new Scanner(System.in);
        System.out.print("Write Array Elements are: ");
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=n.nextInt();
        }

        int Minimum=(getMin(a));
        int Maximum=(getMax(a));

        System.out.println("In this array Minimum number is: "+Minimum);
        System.out.println("In this array Maximum number is: "+Maximum);

       
        n.close();
    }
}
