package uz.humo.day005;

public class MinimumOperationsToMakeArrayEqual1551 {
    public static void main(String[] args) {
        System.out.println(minimumOperations(3));
    }

    public static int minimumOperations(int n) {
        if (n % 2 == 1) {
            return (n * n - 1) / 4;
        } else {
            return (n * n) / 4;
        }
    }
}
