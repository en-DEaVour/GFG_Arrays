package GFG.Arrays;

import java.util.Arrays;

public class MissingNumberInShuffledArray {
    public static void main(String[] args) {
        System.out.println(findMissing(new long[]{1,2,3,4,7},new long[]{2,3,1,7},4));
    }
    static long findMissing(long a[], long b[], int n) {
        Arrays.sort(a);
        Arrays.sort(b);

        long r=0;
        for(int i=0; i<n; i++){
            if(a[i]!=b[i]){
                r=a[i];
            }
        }
        return r;

// Without Sorting 
//        long sum1 = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum1 = sum1 + a[i];
//
//        }
//        long sum2 = 0;
//        for (int i = 0; i < b.length; i++) {
//            sum2 = sum2 + b[i];
//
//        }
//        System.out.println(sum1);
//        System.out.println(sum2);
//        long res = sum1 - sum2;
//
//        return res;

    }
}
