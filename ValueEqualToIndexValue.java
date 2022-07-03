package GFG.Arrays;

import java.util.ArrayList;

public class ValueEqualToIndexValue {
    public static void main(String[] args) {
        System.out.println (valueEqualToIndex(new int[]{5,2,1,8,6},5));
    }
   static int valueEqualToIndex(int[] arr, int n) {
        // code here
       for(int i =0;i<n;i++)
       {
           if(arr[i]==i+1)
           {
                i+1;
           }
       }
       return 0;
   }
}
