package uni.fmi.bachelors;

import java.util.Scanner;

public class Student {
	private String fn;
	private int age;
	private String name;
	private boolean hasStudentRights;
	
	private double[] grades;
	
	public Student(String fn, int age, int gradesCount) {
		this.fn = fn;
		this.age = age;
		grades = new double[gradesCount];
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHasStudentRights() {
		return hasStudentRights;
	}

	public void setHasStudentRights(boolean hasStudentRights) {
		int count = 0;
		
		for(int i = 0; i < grades.length; i++) {
			if(grades[i] < 3) {
				count++;
			}
		}
		if(count > 2) {
			System.err.println("Не може да подновите");
		}else {
			this.hasStudentRights = hasStudentRights;
		}		
	}

	public void fillGrades() {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < grades.length; i++) {
			System.out.println("Въведете оценка: " + (i + 1) );
			grades[i] = in.nextDouble();
		}
	}
	
	public double getAvarageGrade() {
		double sum = 0;
		
		for(int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		
		return sum / grades.length;
	}
	
	public void printInfo() {
		System.out.println("FN: " + fn + " Name: " + name + " Age: "
				+ age + " Rights: " + hasStudentRights);
	}

}
