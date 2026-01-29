package Lecture7;

public class SumOfSquareNumbers {
    public static void main(String[] args) {
        int c = 5;
        boolean ans = judgeSquareSum(c);
    }

    // T.C.:- O(√c)
    // S.C.:- O(1)
    public static boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int)Math.sqrt(c);
        // left*left + right * right = c
        // c - left*left - right * right = 0
        while(left <= right){
            int res = c - left * left - right * right; // c - (left*left + right * right)
            if(res == 0) {
                return true;
            } else if(res > 0) {
                left++;
            } else if(res < 0) {
                right--;
            }
        }

        return false;
    }
}
