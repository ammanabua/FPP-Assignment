package Assignment.Assignment4.Question1;
public class ReverseInt {
    public static void main(String[] args) {
        reverseNum(1234);
        System.out.println("Recursive function finished");
    }
    public static void reverseNum(int n) {
        if (n <= 0){
            System.out.println("Base Case");
            return;
        }else {
            System.out.println(n % 10 + " ");
            reverseNum(n / 10);

        }
    }

}


