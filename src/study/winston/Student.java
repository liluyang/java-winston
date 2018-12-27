package study.winston;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends Person {
	private int studentID;
	private int grade;
	private int classRoom;
	
	public List<Student> sameAge(List<Student> students) {
		ArrayList<Student> list = new ArrayList<Student>();
		for (Student student : students) {
			if (sameAge(student)) list.add(student);
		}
		return list;
	}
}

enum BloodType {
	A,
	B,
	AB,
	O
}

class Person {
	private String city;
	private String state;
	private String country;
	private String firstName;
	private String lastName;
	private Date dob;
	private BloodType bloodType;
	
	@SuppressWarnings("deprecation")
	public boolean sameAge(Person person) {
		return dob.getYear() == person.dob.getYear();
	}
}