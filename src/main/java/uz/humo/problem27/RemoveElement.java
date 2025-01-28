package uz.humo.problem27;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != val) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
        return i;
    }
}
