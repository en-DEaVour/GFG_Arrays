package GFG.Arrays;

import java.util.Arrays;

public class PlayWithOR {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(game_with_number(new int[]{1, 2, 3, 4, 5}, 5)));
    }
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        for (int i = 0; i < n - 1; i++) {

            arr[i] = arr[i] | arr[i + 1];

        }
        return arr;
    }
}
