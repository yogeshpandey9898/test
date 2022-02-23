package com.example.demo;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
	
	private static HashMap<Integer, Student> studentMap = new HashMap<>();
	private static Integer studentId = new Integer(0);
	
	
	public String crateStudent(Student s1) {
		
		int temp = studentId + 1;
		studentId = temp;

		studentMap.put(temp, s1);

		System.out.println("My Data " + studentMap.get(temp));

		
		return "Created With Student id = " + temp;
	}

	
	public Student getMyStudentObject(int studentId) {
		return studentMap.get(studentId);
	}
}
