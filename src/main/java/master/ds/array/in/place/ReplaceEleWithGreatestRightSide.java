package master.ds.array.in.place;

public class ReplaceEleWithGreatestRightSide {
    public static void main(String[] args) {
        replaceEleWithGreatestValue(new int[]{17,18,5,4,6,1});
        replaceEleWithGreatestValue(new int[]{17,18,5,4,33,1});
    }

    public static void replaceEleWithGreatestValue(int[] arr) {
        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int maxEle = findMax(arr, i + 1);
            arr[i] = maxEle;
        }
        arr[arr.length - 1] = -1;
        System.out.println("Result Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int findMax(int[] arr, int index) {
        int maxEle = Integer.MIN_VALUE;
        for (int i = index; i < arr.length; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i];
            }
        }
        return maxEle;
    }
}
