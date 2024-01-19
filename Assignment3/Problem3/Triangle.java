package Assignment.Assignment3.Problem3;

public final class Triangle {

    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }
    public double computeArea(){
        return 0.5 * base * height;
    }
}
