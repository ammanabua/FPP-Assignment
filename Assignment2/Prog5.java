import java.util.Arrays;
import java.util.Scanner;

public class Prog5 {

    public int[] combine(int[] a, int[] b) {


        int[] newArr = new int[a.length + b.length];

        System.arraycopy(a, 0, newArr, 0, a.length);
        System.arraycopy(b, 0, newArr, a.length, b.length);

        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    public static void main(String[] args){


        int[] arr1 = {5, 10, 2, 3, 8, 25, 88};
        int[] arr2 = {3, 1, 24, 5, 2};

        Prog5 prog = new Prog5();

        prog.combine(arr1, arr2);

    }
}
