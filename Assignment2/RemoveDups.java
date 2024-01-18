import java.util.Arrays;
import java.util.Scanner;

public class RemoveDups {

    public static void main(String[] args) {

        String[] arr1 = {"horse", "dog", "cat", "horse", "dog", "cat", "chicken", "chicken"};

        String[] result = new String[arr1.length];
        int resultIndex = 0;

        for (int i = 0; i < arr1.length; ++i){
            for(int j = i+1; j < arr1.length; ++j){
                if (arr1[i].equals(arr1[j])){
                    result[resultIndex] = arr1[i];
                    resultIndex++;
                }
            }
        }

        String[] newResult = new String[resultIndex];

        System.arraycopy(result, 0, newResult, 0, resultIndex);
        System.out.println(Arrays.toString(newResult));


    }
}
