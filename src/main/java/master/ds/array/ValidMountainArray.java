package master.ds.array;
/*
Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]



Example 1:

Input: arr = [2,1]
Output: false
Example 2:

Input: arr = [3,5,5]
Output: false
Example 3:

Input: arr = [0,3,2,1]
Output: true


Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 104
* */
public class ValidMountainArray {
    public static void main(String[] args) {
        System.out.println(ValidMountainArray.validMountainArray(new int[]{2,1}));
        System.out.println(ValidMountainArray.validMountainArray(new int[]{3,5,5}));
        System.out.println(ValidMountainArray.validMountainArray(new int[]{0,3,2,1}));
    }
    public static boolean validMountainArray(int[] arr) {
        if(arr.length<3)
            return false;

        int i=1;
        int incrDecrFlag = 0;
        int incrCount = 0;
        int decrCount = 0;
        while(i<arr.length){
            if(incrDecrFlag==0 && arr[i-1]<arr[i]){
                incrCount+=1;
            } else if(arr[i-1]>arr[i] && incrCount>0 && incrDecrFlag==0){
                decrCount+=1;
                incrDecrFlag=1;
            } else if(incrDecrFlag==1 && arr[i-1]>arr[i]){
                decrCount+=1;
            } else {
                return false;
            }
            i++;
        }

        if(incrCount!=0&&decrCount!=0){
            return true;
        } else {
            return false;
        }
    }
}
