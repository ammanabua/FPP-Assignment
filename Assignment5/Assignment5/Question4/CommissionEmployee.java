package Assignment.Assignment5.Question4;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate/100; // Represent commission rate in Percentage
    }

    public double getGrossSales(){
        return grossSales;
    }

    public void setGrossSales(double grossSales){
        this.grossSales = grossSales;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate){
        this.commissionRate = commissionRate;
    }

    public double getPayment(){
        return grossSales * commissionRate;
    }

    @Override
    public String toString(){
        return "{First Name: " + getFirstName() + "; Last Name: " + getLastName() + "; Social Security Number: " + getSocialSecurityNumber() + "; Gross Sales: " + grossSales + "; Commission Rate: " + commissionRate * 100 + "%}" ;
    }
}
