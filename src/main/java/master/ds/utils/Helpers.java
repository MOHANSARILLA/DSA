package master.ds.utils;

public class Helpers {
    public static void printArray(int[] array) {
        for (int ele:array) {
            System.out.print(" "+ele);
        }
        System.out.println();
    }

    public static void printArray(int[] array, int endSize) {
        for (int i = 0; i < endSize; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }
}
