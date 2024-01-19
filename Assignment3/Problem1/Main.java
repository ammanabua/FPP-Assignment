package Assignment.Assignment3.Problem1;

import Assignment.Assignment3.Problem1.Address;
import Assignment.Assignment3.Problem1.Customer;

public class Main {

    public static void main(String[] args){

        Address address1 = new Address("Molten Street", "Chicago", "Illinois", "19105");
        Address address2 = new Address("North Street", "Philadelphia", "Pennsylvania", "19103");
        Address address3 = new Address("Howard Street", "Chicago", "Illinois", "19105");

        Customer c1 = new Customer("Derek", "Jones", "898-57-2564");
        c1.setBillingAddress(address1);
        c1.setShippingAddress(address1);

        Customer c2 = new Customer("Julius", "Caesar", "763-87-8357");
        c2.setBillingAddress(address2);
        c2.setShippingAddress(address2);

        Customer c3 = new Customer("Remy", "Gold", "235-87-3857");
        c3.setBillingAddress(address3);
        c3.setShippingAddress(address3);


        Customer[] customers = {c1, c2, c3};

        for(Customer customer: customers){
            if (customer.getBillingAddress().getCity().equals("Chicago")){
                System.out.println(customer);
            }
        }

    }
}
