package GFG.Arrays;

public class FindDuplicatesUnderGivenConstraints {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{2,3,4,5,6,1,1,1,1,1}));
    }
    public static int findDuplicate(int A[]) {
        // Your code goes here
        int count = 1;
        for (int i = 0; i < 10; i++) {
            if (A[i] == A[i + 1]) {
                count++;
                if (count == 5) {
                    return A[i];
                }

            }
        }
        return 0;
    }
}
