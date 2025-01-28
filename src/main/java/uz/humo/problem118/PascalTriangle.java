package uz.humo.problem118;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;
        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);
        for (int i = 1; i < numRows; i++) {
            row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
