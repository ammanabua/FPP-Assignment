package Assignment.Assignment8.Problem3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Marketing> marketingList = new ArrayList<>();

        marketingList.add(new Marketing("Jimmy Butler", "NBA Wheaties", 1150));
        marketingList.add(new Marketing("David Owens", "Markers", 925));
        marketingList.add(new Marketing("Josh Hart", "Sneakers", 1015));
        marketingList.add(new Marketing("Kevin Durant", "Nike KDs", 2895));
        marketingList.add(new Marketing("Kyrie Irving", "Puma Kyries Line", 8995));
        marketingList.add(new Marketing("Lebron James", "State Farm Insurance", 20900));



        marketingList.remove(3);

        System.out.println("The size of the Marketing list is: " + marketingList.size());

    }
}
