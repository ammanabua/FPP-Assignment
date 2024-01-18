public class Prog6 {

    static int min(int[] arrayofInts) {

        int min = arrayofInts[0];
        for(int i = 0; i < arrayofInts.length; ++i){
            if (arrayofInts[i] < min){
                min = arrayofInts[i];
            }
        }

        System.out.print("Minimum in the array: " + min);
        return min;
    }

    public static void main(String[] args) {
        int[] a = {-10, 5, 8, 22, -30, 40, -50};

        Prog6.min(a);
    }
}
