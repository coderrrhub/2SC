package Lecture17;

public class SortParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] ans = sortArrayByParity(nums);
        for(int ele : ans) {
            System.out.println(ele);
        }
    }

    public static int[] sortArrayByParity(int[] nums) {
        int evenPos = 0;
        int oddPos = nums.length-1;

        while(evenPos < oddPos) {
            // swap evenPos ---> oddNumber and oddPos ----> evenNumber
            if(nums[evenPos] % 2 != 0 && nums[oddPos] % 2 == 0) {
                int temp = nums[evenPos];
                nums[evenPos] = nums[oddPos];
                nums[oddPos] = temp;
                evenPos++;
                oddPos--;
            }

            // evenPos++; // 
            if(nums[evenPos] % 2 == 0) {
                evenPos++;
            }

            // oddPos--
            if(nums[oddPos] % 2 != 0) {
                oddPos--;
            }

        }

        return nums;
    }
}
