package uz.humo.day005;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
    }
    private static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sum + nums[i];
            sum = nums[i];
        }
        return nums;
    }
}
