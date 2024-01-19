package Assignment.Assignment3.Problem1;

import Assignment.Assignment3.Problem1.Address;

public class Customer {
    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address shippingAddress;

    private Address billingAddress;


    public Customer (String firstName, String lastName, String socSecurityNum){
        this.firstName = firstName;

        this.lastName = lastName;

        this.socSecurityNum = socSecurityNum;
    }

    public String getFirstName() {
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

    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public void setSocSecurityNum(String socSecurityNum){
        this.socSecurityNum = socSecurityNum;
    }

    public Address getBillingAddress(){
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress){
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress(){
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress){
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
                + "]";
    }
}

