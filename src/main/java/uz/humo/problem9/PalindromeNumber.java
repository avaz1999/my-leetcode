package uz.humo.problem9;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("isPalindrome(121) = " + isPalindrome(121));
    }

    private static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }
}
