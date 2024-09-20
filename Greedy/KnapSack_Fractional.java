package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class KnapSack_Fractional {
        class Solution {
    static  class ItemComparator implements Comparator<Item>{
        @Override
        public  int compare(Item a,Item b){
            double r1 = (double)a.value/a.weight;
            double r2 = (double)b.value/b.weight;
            return Double.compare(r2,r1);
        }
    }
    double fractionalKnapsack(int w, Item arr[], int n) {
         Arrays.sort(arr, new ItemComparator());
         
         double totalvalue = 0.0;
         int currentweight = 0;
         
         for(int i = 0;i<n;i++){
             if(currentweight + arr[i].weight <= w){
                 currentweight += arr[i].weight;
                 totalvalue += arr[i].value;
             } else{
                 int remainingweight = w - currentweight;
                 totalvalue += arr[i].value * (double)remainingweight/arr[i].weight;
                 break;
             }
         }
         return totalvalue;
    }
}
}
