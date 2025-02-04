package uz.humo.day007;

public class CountDigits2520 {
    public static void main(String[] args) {
        System.out.println(countDigits(121));
    }
    public static int countDigits(int n) {
        int count = 0;
        int num = n;
        while (n > 0) {
            int digits = n % 10;
            if (num % digits == 0) count++;
            n /= 10;
        }
        return count;
    }
}
