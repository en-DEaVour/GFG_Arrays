package GFG.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        System.out.println(largest(new int[]{20,14,90,100,120},5));
    }
    static int largest(int arr[], int n)
    {
        int max = arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
