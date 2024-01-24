package Assignment.Assignment5.Question4;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new CommissionEmployee("Johnny", "Arnold", "345-95-3582", 903, 15),
                new HourlyEmployee("Kevin", "Noah", "985-83-9821", 3500, 45),
                new SalariedEmployee("Sarah", "Watkins", "679-38-2852", 7900),
                new BasePlusCommissionEmployee("Jennifer", "Williams", "385-75-2345", 400, 18, 9000),
                new SalariedEmployee("Timothy", "Samuels", "385-86-1456", 3500)
        };

        double totalSalaries = 0;
        for (Employee employee: employees){
            totalSalaries += employee.getPayment();
        }

        System.out.println("Total Salaries for Employees: " + totalSalaries);
    }
}
