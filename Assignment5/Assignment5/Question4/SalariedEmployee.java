package Assignment.Assignment5.Question4;

public class SalariedEmployee extends Employee{

    private double weeklySalary;

    SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary){
        this.weeklySalary = weeklySalary;
    }

    public double getPayment(){
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "{First Name: " + getFirstName() + "; Last Name: " + getLastName() + "; Social Security Number: " + getSocialSecurityNumber() + "; Weekly Salary: " + weeklySalary + "}";
    }
}
