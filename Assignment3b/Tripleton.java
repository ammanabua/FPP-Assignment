package Assignment.Assignment3b;

public class Tripleton {
    private static int count;

    private Tripleton() {

        count++;
    }

    public static Tripleton createInstance(){
        if (count < 3){
            Tripleton instance = new Tripleton();
            System.out.println("Instance Created!");
            return instance;
        }else {
            System.out.println("Error! Maximum instances created!");
            return null;
        }
    }

    public static void main(String[] args) {

        Tripleton t1 = Tripleton.createInstance();
        Tripleton t2 = Tripleton.createInstance();
        Tripleton t3 = Tripleton.createInstance();
        Tripleton t4 = Tripleton.createInstance();
        Tripleton t5 = Tripleton.createInstance();

    }

}
