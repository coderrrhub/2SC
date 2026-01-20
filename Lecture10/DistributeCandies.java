package Lecture10;

import java.util.Arrays;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3};
        int ans = distributeCandies(candyType);
        System.out.println(ans);
    }

    // T.C.:- O(NLogN) + O(N)
    // S.C.:- O(1)
    public static int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int differentCandiesAvailable = 1;
        for(int i = 1; i < candyType.length; i++) {
            if(candyType[i] != candyType[i-1]) {
                differentCandiesAvailable++;
            }
        }

        int capacity = candyType.length/2;
        if(differentCandiesAvailable <= capacity) {
            return differentCandiesAvailable;
        } else {
            return capacity;
        }
    }
}
