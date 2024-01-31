package Assignment.Assignment8.Problem3;

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
}
