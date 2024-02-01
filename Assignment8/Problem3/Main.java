package Assignment.Assignment8.Problem3;

import java.util.*;

import static Assignment.Assignment8.Problem3.Marketing.*;

public class Main {
    public static void main(String[] args) {
        List<Marketing> marketingList = new ArrayList<>();

        add(marketingList, new Marketing("Jimmy Butler", "NBA Wheaties", 21150));
        add(marketingList, new Marketing("Josh Hart", "Sneakers", 31015));
        add(marketingList, new Marketing("Kevin Durant", "Nike KDs", 89));
        add(marketingList, new Marketing("Kyrie Irving", "Puma Kyries Line", 8995));
        add(marketingList, new Marketing("Lebron James", "State Farm Insurance", 20900));



        remove(marketingList, new Marketing("Josh Hart", "Sneakers", 1015));
//
        System.out.println("The size of the Marketing list is: " + marketingList.size());
//
        System.out.println("Sorted according to sales more than 1000");
        sortListBySalesAmount(marketingList);
        System.out.println(marketingList);
        System.out.println();
        sortListByEmployeeName(marketingList);
        System.out.println(marketingList);

        System.out.println(listMoreThan1000(marketingList));
    }


    public static void sortListBySalesAmount(List<Marketing> list){
        Collections.sort(list, Comparator.comparingDouble(Marketing::getSalesAmount));
    }

    public static void sortListByEmployeeName(List<Marketing> list){
        Collections.sort(list, Comparator.comparing(Marketing::getEmployeeName));
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list){
        List<Marketing> resultList = new ArrayList<>();
        for(Marketing item: list){
            if(item.getSalesAmount() > 1000){
                resultList.add(item);
            }
        }
        return resultList;
    }
}
