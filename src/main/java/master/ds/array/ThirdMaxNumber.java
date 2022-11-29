package master.ds.array;

public class ThirdMaxNumber {
    public static void main(String[] args) {
        System.out.println(findThirdMax(new int[]{3,2,1}));
        System.out.println(findThirdMax(new int[]{1,2,3}));
        System.out.println(findThirdMax(new int[]{2,2,3,1}));
        System.out.println(findThirdMax(new int[]{1,2,-2147483648}));
        System.out.println(findThirdMax(new int[]{1,2,2,5,3,5}));
    }

    public static int findThirdMax(int[] nums) {
        long firstMax = nums[0];
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            } else if (nums[i] > secondMax && firstMax != nums[i]) {
                thirdMax = secondMax;
                secondMax = nums[i];
            } else if (nums[i] > thirdMax && firstMax != nums[i] && secondMax != nums[i]) {
                thirdMax = nums[i];
            }
        }
        if (thirdMax == Long.MIN_VALUE) {
            return Integer.valueOf(String.valueOf(firstMax));
        }
        return Integer.valueOf(String.valueOf(thirdMax));
    }
}
