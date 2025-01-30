package uz.humo.day004;

public class NumberOfStepsToReduceANumberToZero1342 {
    public static void main(String[] args) {
        System.out.println(numberOfStepsToReduce(14));
    }
    public static int numberOfStepsToReduce(int n) {
        int count = 0;
        while(n > 0){
            if(n % 2 == 0){
                n /= 2;
            }else {
                n -= 1;
            }
            count++;
        }
        return count;
    }
}
