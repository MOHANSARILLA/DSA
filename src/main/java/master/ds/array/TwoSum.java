package master.ds.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
* */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, List> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            List<Integer> list = new ArrayList<>();
            if(map.containsKey(nums[i])) {
                list = map.get(nums[i]);
            }
            list.add(i);
            map.put(nums[i], list);
        }

        int[] resArray = new int[2];

        for(int i=0;i<nums.length;i++) {
            if(map.get(nums[i]).size() > 1){
                map.remove(map.get(nums[i]).remove((Object) i));
            } else {
                map.remove(nums[i]);
            }

            int resNum = target - nums[i];
            if(map.containsKey(resNum)){
                resArray[0]=i;
                List<Integer> list = map.get(resNum);
                int resIndex = list.get(0);
                resArray[1]=resIndex;
                break;
            }
            List<Integer> list = new ArrayList<>();
            if(map.containsKey(nums[i])){
                list = map.get(nums[i]);
            }
            list.add(i);
            map.put(nums[i], list);
        }
        return resArray;
    }

    public static void main(String[] args) {
        int[] res1 = twoSum(new int[]{2, 5, 5, 11}, 10);
        for (int val : res1) {
            System.out.print(" "+val);
        }
        System.out.println();
        int[] res2 = twoSum(new int[]{2, 5, 6, 11}, 7);
        for (int val : res2) {
            System.out.print(" "+val);
        }

        System.out.println();
        int[] res3 = twoSum(new int[]{2, 5, 6, 11}, 11);
        for (int val : res3) {
            System.out.print(" "+val);
        }

    }
}
