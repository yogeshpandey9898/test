package com.example.demo;

import java.util.Objects;

public class Student {
	
	String name;
	String surname;
	int age;
	int totalMarks;
	String result;
	public Student(String name, String surname, int age, int totalMarks, String result) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.totalMarks = totalMarks;
		this.result = result;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, result, surname, totalMarks);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(result, other.result)
				&& Objects.equals(surname, other.surname) && totalMarks == other.totalMarks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", age=" + age + ", totalMarks=" + totalMarks
				+ ", result=" + result + "]";
	}
	
	

}
