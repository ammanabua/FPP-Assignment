package Assignment.Assignment4.Question2;

public class CountDigits {

    public static void main(String[] args) {
        int n = 1234;
        int digitCount = countDigits(n);
        System.out.println("The number of digits in " + n + ": " + digitCount);
    }

    static int count = 0;
    public static int countDigits(int n){
        if(n <= 0) {
            System.out.println("Base Case");
            return 1;
        } else {
            countDigits(n/10);
            count++;
        }
        return count;
    }
}
