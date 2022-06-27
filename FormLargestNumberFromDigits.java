package GFG.Arrays;

import java.util.Arrays;

public class FormLargestNumberFromDigits {
    public static void main(String[] args) {
        System.out.println(MaxNumber(new long[]{0,1,2,3,9,8},6));
    }
    static String MaxNumber(long arr[], long n)
    {
        //code here.
        Arrays.sort(arr);
        StringBuilder s = new StringBuilder();
        for(int i=0;i<n;i++){
            s.append(arr[i]);
        }
        s.reverse();
        return s.toString();
    }
}
