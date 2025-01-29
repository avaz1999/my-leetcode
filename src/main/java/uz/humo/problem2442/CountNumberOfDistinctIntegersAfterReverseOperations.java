package uz.humo.problem2442;

import java.util.HashSet;
import java.util.Set;

public class CountNumberOfDistinctIntegersAfterReverseOperations {
    public static void main(String[] args) {
        System.out.println(countNumberOfDistinctIntegers(new int[]{1, 13, 10, 12, 31}));
    }

    public static int countNumberOfDistinctIntegers(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for (int num : nums) {
            res.add(num);
            res.add(reverse(num));
        }
        return res.size();
    }

    private static int reverse(int x) {
        int res = 0;
        while (x > 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;
    }
}
