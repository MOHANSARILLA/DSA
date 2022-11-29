package master.ds.array;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
        System.out.println(heightChecker(new int[]{5,1,2,3,4}));
        System.out.println(heightChecker(new int[]{1,2,3,4,5}));
    }
    public static int heightChecker(int[] heights) {
        int[] arr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(arr);
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=heights[i]) {
                counter+=1;
            }
        }
        return counter;
    }
}
