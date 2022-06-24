package GFG.Arrays;

import java.util.Arrays;

public class CheckIfTwoArraysAreEqualOrNot {
    public static void main(String[] args) {
        System.out.println(check(new long[]{1,4,3,7},new long[]{1,3,7,4},4));
    }
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        if(Arrays.equals(A,B))
            return true;
        else
            return false;
    }
}
