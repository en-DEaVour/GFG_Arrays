package GFG.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        System.out.println(getSum(new long[]{1,2,3,4},4));
    }
    static long getSum(long a[], long n)
    {
        // Your code goes here
        long sum =0;

        for(int i =0;i<n;i++)
        {
            sum = sum + a[i];
        }
        return sum;
    }
}
