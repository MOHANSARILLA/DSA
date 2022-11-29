package master.ds.array.in.place;

public class MoveZeros {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
        moveZeroes(new int[]{0});
    }

    public static void moveZeroes(int[] nums) {
        if(nums.length<=1){
            System.out.println(nums[0]);
            return;
        }
        int insertPos = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        for(int i=insertPos;i<nums.length;i++){
            nums[i]=0;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
