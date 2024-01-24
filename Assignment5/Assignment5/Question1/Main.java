package Assignment.Assignment5.Question1;

public class Main {

    public static void printTotal(Shape[] shapes){
        double sumArea = 0;
        double sumPerimeter = 0;

        for(Shape s: shapes){
            sumArea += s.calculateArea();
            sumPerimeter += s.calculatePerimeter();
        }

        System.out.println("Sum of total Area of Shapes: " + sumArea);
        System.out.println("Sum of total Perimeter of Shapes: " + sumPerimeter);
    }

    public static void main(String[] args) {
        Shape[] shapes = {new Circle("Green", 5.0), new Rectangle("Blue", 10.0, 5.0), new Square("Brown", 10.0), new Rectangle("Black", 6, 8), new Circle("White", 10.0)};

        printTotal(shapes);

    }
}
