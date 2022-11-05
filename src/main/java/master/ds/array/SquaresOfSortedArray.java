package master.ds.array;

import master.ds.utils.Helpers;

/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.


Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
* */
public class SquaresOfSortedArray {
    public static void main(String[] args) {
        Helpers.printArray(sortedSquares(new int[]{-4,-1,0,3,10}));
        Helpers.printArray(sortedSquares(new int[]{-7,-3,2,3,11}));
        Helpers.printArray(sortedSquares(new int[]{-1}));
        Helpers.printArray(sortedSquares(new int[]{-5,-4,-3,-2,-1}));
    }

    public static int[] sortedSquares(int[] nums) {
        int digitFrequencyMapArrayLength = Math.abs(nums[nums.length-1])+1;
        if(nums.length!=0){
            int firstIndexAbsVal = Math.abs(nums[0]);
            if(firstIndexAbsVal+1 > digitFrequencyMapArrayLength) {
                digitFrequencyMapArrayLength = firstIndexAbsVal+1;
            }

        }
        int[] digitFrequencyMap = new int[digitFrequencyMapArrayLength];
        for(int i=0;i<nums.length;i++) {
            int absValue = Math.abs(nums[i]);
            digitFrequencyMap[absValue] = digitFrequencyMap[absValue] + 1;
        }

        int resIndex = 0;
        for(int i=0;i<digitFrequencyMap.length;i++){
            if(digitFrequencyMap[i] > 1) {
                for(int j=0;j<digitFrequencyMap[i];j++) {
                    nums[resIndex] = i*i;
                    resIndex+=1;
                }
            } else if(digitFrequencyMap[i] == 1) {
                nums[resIndex] = i*i;
                resIndex+=1;
            }
        }

        return nums;
    }
}
