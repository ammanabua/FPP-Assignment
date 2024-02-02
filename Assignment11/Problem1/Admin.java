package Assignment.Assignment11.Problem1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> map = new HashMap<>();

		for (Student student: students){
			Key key = new Key(student.getFirstName(), student.getLastName());

			map.put(key, student);
		}

		return map;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
               //implements
		double grades = 0.0;

		for (Student student: maps.values()){
			grades += student.getGpa();
		}
		return grades/maps.size();
	}
}
