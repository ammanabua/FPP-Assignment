package Assignment.Assignment5.Question4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    double baseSalary;

    BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public double getPayment(){
        return baseSalary + (getGrossSales() * getCommissionRate());
    }

    @Override
    public String toString(){
        return "{First Name: " + getFirstName() + "; Last Name: " + getLastName() + "; Social Security Number: " + getSocialSecurityNumber() + "; Gross Sales: " + getGrossSales() + "; Commission Rate: " + getCommissionRate() * 100 + "%; Base Salary: " + baseSalary + "}" ;
    }
}
