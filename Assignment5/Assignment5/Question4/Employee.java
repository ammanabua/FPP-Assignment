package Assignment.Assignment5.Question4;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    };

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public abstract double getPayment();

}
