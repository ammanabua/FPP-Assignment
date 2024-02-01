package Assignment.Assignment8.Problem2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		double sum = 0;
		//implement
		//compute sum of all salaries of people in aList and return
		for (EmployeeData employee: aList){
			sum += employee.getSalary();
		}
		return sum;
	}
}
