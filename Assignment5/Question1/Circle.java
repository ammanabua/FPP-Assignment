package Assignment.Assignment5.Question1;

public class Circle extends Shape {
    protected double radius;

    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    protected double calculateArea(){
        return (Math.PI * Math.pow(radius, 2.0));
    }

    protected double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}
