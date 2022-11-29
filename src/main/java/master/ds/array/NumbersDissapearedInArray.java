package master.ds.array;

import java.util.*;

public class NumbersDissapearedInArray {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers(new int[]{1,1}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.get(nums[i])+1);
        }
        for (Integer key:map.keySet()) {
            if (map.get(key) == 0) {
                list.add(key);
            }
        }
        return list;
    }
}
