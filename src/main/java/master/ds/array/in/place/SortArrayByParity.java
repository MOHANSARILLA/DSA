package master.ds.array.in.place;

public class SortArrayByParity {
    public static void main(String[] args) {
        sortArrayByParity(new int[]{3,1,2,4});
        sortArrayByParity(new int[]{0});
    }

    public static int[] sortArrayByParity(int[] nums) {
        for (int left = 0, right = (nums.length-1); left < right; ) {
            if (nums[left] % 2 == 1 && nums[right] % 2 == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            } else if (nums[left] % 2 == 0 || nums[right] % 2 == 1) {
                if (nums[left] % 2 == 0) {
                    left++;
                } else {
                    right--;
                }
            } else {
                left++;
                right--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        return nums;
    }
}
