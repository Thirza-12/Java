public class Arrays {
    public static void main(String[] args) {
        int []num={2,3,4};
        int []n=new int[5]; // mentioning size is necessary
        // multi-dimensional array
        int [][]nums=new int[3][]; // row mentioning is necessary int[3][4] is also applicable
        nums[0]=new int[3];
        nums[1]=new int[4];
        nums[2]=new int[2];
        for (int i=0;i<nums.length;i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]=j;
            }
        }
        for (int i=0;i<nums.length;i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
