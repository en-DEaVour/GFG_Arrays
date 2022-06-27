package GFG.Arrays;

public class BinaryArraySorting {
    public static void main(String[] args) {
        binSort(new int[]{1,0,1,1,0,0,1},7);

    }
    static void binSort(int A[], int N) {
        // add your code here

        int i = -1;

        for (int j = 0; j < A.length; j++) {
            if (A[j] == 0) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        for(int k=0;k<A.length;k++)
        {
            System.out.println(A[k]);
        }
    }
}
