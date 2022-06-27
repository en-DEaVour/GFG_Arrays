package GFG.Arrays;

import GFG.Mathematical.FindTheMedian;

public class WaveArray {
    public static void main(String[] args) {
        convertToWave(5,new int[]{1,2,3,4,5});
    }
    public static void convertToWave(int n, int[] a) {
        // code here
        for (int i = 1; i < n; i += 2) {
            int temp = a[i];
            a[i] = a[i - 1];
            a[i - 1] = temp;
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
