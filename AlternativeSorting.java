package GFG.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternativeSorting {
    public static void main(String[] args) {

        int[] arr = {5,6,7,8,9,1,2,3,4};
        int N = arr.length;
        Arrays.sort(arr);
        // Printing the last element of array
        // first and then first element and then
        // second last element and then second
        // element and so on.


        int i = 0;
        int j = N - 1;

        while (i < j) {
            System.out.print(arr[j]);
            System.out.print(arr[i]);
            i++;
            j--;
        }

        // If the total element in array is odd
        // then print the last middle element.
        if (N % 2 != 0)
            System.out.print(arr[i]);
    }
}



