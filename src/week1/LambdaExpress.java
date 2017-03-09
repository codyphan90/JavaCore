package week1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpress {
public static void main(String[] args) {
	Student s1 = new Student(101, "A", 23);
	Student s2 = new Student(104, "D", 21);
	Student s3 = new Student(103, "E", 25);
	Student s4 = new Student(106, "C", 25);
	Student s5 = new Student(105, "B", 27);
	
	
	List<Student> list = new ArrayList<>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	list.add(s5);
	
	//Sort with Inner class
	Collections.sort(list, new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
	});
	for (Student student : list) {
		System.out.println(student.getName());
	}
	
	 // Use Lambda instead
	System.out.println("Use Lambda");
	Collections.sort(list, (Student o1, Student o2) -> o1.getName().compareTo(o2.getName()));
	
	for (Student student : list) {
		System.out.println(student.getName());
	}
	
	
}
	
}
