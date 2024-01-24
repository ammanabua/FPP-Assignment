package Assignment.Assignment5.Question2;

public class Secretary extends DeptEmployee {
    private double overtimeHours;

    public Secretary(String name, int salary, int year, int month, int day){
        super(name, salary, year, month, day);
    }

    public double getOvertimeHours(){
        return overtimeHours;
    }

    public void setOvertimeHours(double n){
        overtimeHours = n;
    }

    @Override
    public double computeSalary(){
        return salary + (12 * overtimeHours);
    }
}
