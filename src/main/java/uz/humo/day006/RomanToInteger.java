package uz.humo.day006;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>(
                Map.of(
                        'I', 1,
                        'V', 5,
                        'X', 10,
                        'L', 50,
                        'C', 100,
                        'D', 500,
                        'M', 1000
                ));
        int sum = 0;
        int prev = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            if (curr > prev) {
                sum += curr - 2 * prev;
            } else {
                sum += curr;
            }
            prev = curr;
        }
        return sum;
    }
}
