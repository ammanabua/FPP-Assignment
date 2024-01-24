package Assignment.Assignment5.Question1;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }


    protected double calculateArea(){
        return width * height;
    }

    protected double calculatePerimeter(){
        return 2 * (width + height);
    }
}
