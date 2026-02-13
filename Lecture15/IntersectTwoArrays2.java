import java.util.ArrayList;
import java.util.HashMap;

public class IntersectTwoArrays2 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] ans = intersect(nums1, nums2);
        for(int ele : ans) {
            System.out.println(ele);
        }
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++) {
            int ele = nums1[i];
            if(map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq+1);
            } else {
                map.put(ele, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++) {
            int ele = nums2[i];
            if(map.containsKey(ele)) {
                // intersect
                list.add(ele);
                int freq= map.get(ele);
                map.put(ele, freq-1);
                if(map.get(ele) == 0) { // freq  == 1
                    map.remove(ele);
                }
            }
        }

        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
