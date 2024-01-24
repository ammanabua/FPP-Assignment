package Assignment.Assignment5.Question4;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours){
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage(){
        return wage;
    }

    public void setWage(double wage){
        this.wage = wage;
    }

    public double getHours(){
        return hours;
    }

    public void setHours(double hours){
        this.hours = hours;
    }

    public double getPayment(){
        return wage * hours;
    }

    @Override
    public String toString() {
        return "{First Name: " + getFirstName() + "; Last Name: " + getLastName() + "; Social Security Number: " + getSocialSecurityNumber() + "; Wage: " + wage + "; Hours: " + hours + "}";
    }
}
