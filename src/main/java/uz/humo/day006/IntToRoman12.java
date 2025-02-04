package uz.humo.day006;

import java.util.HashMap;
import java.util.Map;

public class IntToRoman12 {
    public static void main(String[] args) {

    }

    public static String intToRoman(int num) {
        Map<String, Integer> map = new HashMap<>(
                Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500, "M", 1000));
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
        }
        return sb.toString();
    }
}
