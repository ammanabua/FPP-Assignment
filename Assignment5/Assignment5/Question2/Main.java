package Assignment.Assignment5.Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Josh Kim", 85000, 2001, 4, 28);
        Professor prof1 = new Professor("Dave Giddey", 90000, 2021, 8, 15);
        Professor prof2 = new Professor("Sandra Jacobs", 95000, 2009, 2, 11);

        Secretary jay = new Secretary("Janet Barry", 45000, 1993, 11, 1);
        Secretary liz = new Secretary("Liz Benson", 39000, 2005, 7, 4);

        DeptEmployee[] department = new DeptEmployee[5];

        department[0] = prof;
        department[1] = prof1;
        department[2] = prof2;
        department[3] = jay;
        department[4] = liz;

        Scanner sc = new Scanner(System.in);

        double salarySum = 0;

        System.out.println("Do you wish to see the sum of all Professor and Secretary salary in the department?");

        String response = sc.nextLine().toUpperCase();

        if(response.equals("Y")){
            for(DeptEmployee d: department){
                salarySum += d.computeSalary();
            }
        } else {
            System.out.println("You have opted not to see the sum of salaries. Program exiting...");
            return;
        }

        System.out.println("The sum of all salaries in the Department: " + salarySum);

    }
}
