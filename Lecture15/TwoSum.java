import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(ans[0]+"  "+ans[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int find = target - nums[i];
            if(map.containsKey(find)) {
                int[] ans = new int[2];
                ans[0] = i;
                ans[1] = map.get(find);
                return ans;
            }

            map.put(nums[i], i); // storing for the future partner
        }


        return null;
    }
}
