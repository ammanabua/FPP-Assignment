public class Prog4 {

    static public void main (String[] args){

        float x = 1.27f;
        float y = 3.881f;

        float z = 9.6f;

        int sum = (int)(x + y + z);

        float fsum = x + y + z;

        System.out.println("Sum of float as Integer: " + sum);
        System.out.println("Sum of float as Integer to nearest whole number: " + Math.round(fsum));
    }

}
