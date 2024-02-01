package Assignment.Assignment8.Problem3;

import java.util.*;

public class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;

    public Marketing(String employeeName, String productName, double salesAmount){
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public double getSalesAmount(){
        return salesAmount;
    }

    public void setSalesAmount(double sales){
        salesAmount = sales;
    }

    public static void add(List<Marketing> list, Marketing marketing){
        list.add(marketing);
    }

    public static void remove(List<Marketing> list, Marketing marketing){
        list.remove(marketing);
    }

    @Override
    public String toString(){
        return "{Employee: " + employeeName + ", Product: " + productName + ", Sales: $" + salesAmount + "}";
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Marketing marketing = (Marketing) obj;

        return employeeName.equals(marketing.employeeName) && productName.equals(marketing.productName) && Double.compare(salesAmount, marketing.salesAmount) == 0;
    }

    @Override
    public int hashCode(){
        return Objects.hash(employeeName, productName, salesAmount);
    }
}
