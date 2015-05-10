package com.arun.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.arun.model.Student;
import com.arun.util.CompareByFirstName;
import com.arun.util.CompareByFullName;
import com.arun.util.CompareBySecondName;
import com.arun.util.CompareStudentByAge;
import com.arun.util.StudentComparatorChain;

public class StudentComparatorByMultipleFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Arun","Prasad",25));
		studentList.add(new Student("Dhivya","Selvaraj",23));
		studentList.add(new Student("Ishwarya","Bhuvana",23));
		studentList.add(new Student("Gokul","VenuGopal",26));
		studentList.add(new Student("Dhoni","Singh",32));
		studentList.add(new Student("Parthiban","Selvaraj",29));
		studentList.add(new Student("Revathi","Janardhanan",24));
		studentList.add(new Student("Siva","karthikeyan",26));
		studentList.add(new Student("Losini","Padmanaban",22));
		studentList.add(new Student("Ian","Somerhalder",30));
		studentList.add(new Student("Lee","minho",28));
		studentList.add(new Student("Surya","Sivakumar",32));
		Collections.sort(studentList, new StudentComparatorChain(new CompareStudentByAge(),new CompareByFirstName(),new CompareBySecondName()));
		System.out.println("Sorted Based on following order age,1st name and 2nd name");
		printList(studentList);
		Collections.sort(studentList, new StudentComparatorChain(new CompareStudentByAge(),new CompareByFullName()));
		System.out.println("Sorted Based on following order age,full name");
		printList(studentList);
		
	}
	private static void printList(List<Student> studentList){
		for(Student stud: studentList){
			System.out.println("Fname"+stud.getFirstName()+"####Sname"+stud.getSecondName()+"####Age"+stud.getAge());
			
		}
	}
	

}
