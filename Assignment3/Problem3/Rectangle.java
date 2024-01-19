package Assignment.Assignment3.Problem3;

public final class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }
    public double computeArea(){
        return length * width;
    }
}
