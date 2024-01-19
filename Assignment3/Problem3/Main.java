package Assignment.Assignment3.Problem3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");

        String input = sc.nextLine().toUpperCase();

        switch (input){
            case "C":
                System.out.println("Enter the radius of the circle");
                double radius = sc.nextDouble();
                sc.nextLine();
                Circle c = new Circle(radius);
                System.out.println("The radius of the circle is: " + c.computeArea());
                break;

            case "R":
                System.out.println("Enter the width of the Rectangle: ");
                double width = sc.nextDouble();
                sc.nextLine();

                System.out.println("Enter the height of the Rectangle: ");
                double length = sc.nextDouble();
                sc.nextLine();

                Rectangle r = new Rectangle(width, length);

                System.out.println("The area of the Rectangle is: " + r.computeArea());
                break;

            case "T":
                System.out.println("Enter the base of the Triangle: ");
                double base = sc.nextDouble();
                sc.nextLine();

                System.out.println("Enter the height of the Triangle: ");
                double height = sc.nextDouble();
                sc.nextLine();

                Triangle t = new Triangle(base, height);

                System.out.println("The area of the Triangle is: " + t.computeArea());
                break;

            default:
                System.out.println("Invalid Input! Please enter 'C' for Circle, 'R' for Rectangle or 'T' for Triangle");
        }
    }
}
