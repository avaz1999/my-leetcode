package uz.humo.problem119;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static void main(String[] args) {
        System.out.println("getRow(3) = " + getRow(3));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long prev = 1;
        for (int i = 1; i <= rowIndex; i++) {
            long nextVal = prev * (rowIndex - i + 1)/i;
            res.add((int) nextVal);
            prev = nextVal;
        }
        return res;
    }
}
