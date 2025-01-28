package uz.humo.problem7;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow bo'lsa 0 qaytaradi
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow bo'lsa 0 qaytaradi
            }
            rev = rev * 10 + digit;
        }
        return rev;
    }
}
