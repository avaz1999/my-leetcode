package uz.humo.problems14;

public class LongestCommonPrefix {
    public static void main(String[] args) {

    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            char c = strs[i].charAt(0);
            for (int j = 1; j < strs.length; j++) {
                if (c != strs[j].charAt(0)) {
                    return prefix;
                }
            }
            prefix = prefix + " " + strs[i];
        }
        return prefix;
    }
}
