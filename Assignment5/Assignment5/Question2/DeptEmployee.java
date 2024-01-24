package Assignment.Assignment5.Question2;

import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    protected int salary;
    private LocalDate hireDate;

    public DeptEmployee(String name, int salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDate getHireDate(){
        return hireDate;
    }

    public void setHireDate(int year, int month, int day){
        this.hireDate = LocalDate.of(year, month, day);
    }

    public double computeSalary(){
        return salary;
    }
}
