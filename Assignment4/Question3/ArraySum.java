package Assignment.Assignment4.Question3;

public class ArraySum {

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8};
        System.out.println("Sum of the array: " + findSum(arr, arr.length));
    }

    public static int findSum(int[] a, int n){
        if (n <= 0){
            System.out.println("Base Case");
            return 0;
        } else{
            return (findSum(a, n-1) + a[n -1]);
        }
    }
}
