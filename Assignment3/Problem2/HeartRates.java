package Assignment.Assignment3.Problem2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class HeartRates {

    private String firstName;
    private String lastName;
    private String DOB;

    private int RHR = 70;
    private int MHR;

    private double AHR;

    private double LB = 0.5;
    private double UB = 0.85;
    private double LBTHR;
    private double UBTHR;




    public HeartRates(String firstName, String lastName, String DOB){
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;

        System.out.println("The Target Heart Rate Range is between " + this.calLowerBoundary() + " and " + this.calUpperBoundary());
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + getAge());
        System.out.println("Date of Birth: " + DOB);
        System.out.println("Maximum Heart Rate: " + maxHeartRate());
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "DOB: " + DOB
                + "]";
    }

    public int getAge(){
        LocalDate birthday = LocalDate.parse(DOB);
        int years = (int) ChronoUnit.YEARS.between(birthday, LocalDate.now());
        return years;
    }

    public int maxHeartRate(){
        this.MHR = 220 - getAge();
        return MHR;
    }

    public double calLowerBoundary(){
        this.LBTHR = (calAverageHeartRate() * LB) + RHR;
        return LBTHR;
    }

    public double calUpperBoundary(){
        this.UBTHR  = (calAverageHeartRate() * UB) + RHR;
        return UBTHR;
    }

    public double calAverageHeartRate(){
        this.AHR = maxHeartRate() - RHR;
        return AHR;
    }


    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your first name: ");

        String firstName = sc.nextLine();

        System.out.println("Please, enter your last name: ");
        String lastName = sc.nextLine();

        System.out.println("Please, enter your birth date in the format-(yyyy-mm-dd) - Example 1989-04-14");
        String DOB = sc.nextLine();



        HeartRates charles = new HeartRates(firstName, lastName, DOB);
    }
}
