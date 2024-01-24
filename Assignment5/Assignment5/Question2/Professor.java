package Assignment.Assignment5.Question2;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
    private int numberOfPublications;

    public Professor(String name, int salary, int year, int month, int day){
        super(name, salary, year, month, day);
    }

    public int getNumberOfPublications(){
        return numberOfPublications;
    }

    public void setNumberOfPublications(int n){
        numberOfPublications = n;
    }

}
