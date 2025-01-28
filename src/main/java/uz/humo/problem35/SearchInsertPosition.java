package uz.humo.problem35;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums[nums.length - 1] < target) return nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return -1;
    }
}
