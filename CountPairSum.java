package GFG.Arrays;

public class CountPairSum {
    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{1,2,3,4},new int[]{7,3,5,4},4,4,8));
    }
    static int countPairs(int arr1[],int arr2[], int M, int N, int x)
    {
        //code here.
        int count=0;
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(arr1[i]+arr2[j]==x)
                    count++;
            }
        }
        return count;
    }
}
