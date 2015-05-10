package com.arun.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.arun.model.Student;
import com.arun.util.CompareByFirstName;
import com.arun.util.CompareStudentByAge;
import com.arun.util.StudentComparatorChain;

public class StudentComparatorByMultipleFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Arun","Prasad",24));
		studentList.add(new Student("Arun","Prasad",25));
		studentList.add(new Student("Hardik","Pandya",26));
		studentList.add(new Student("Parthiv","Ptael",23));
		Collections.sort(studentList, new StudentComparatorChain(new CompareStudentByAge(),new CompareByFirstName()));
		printList(studentList);
		
	}
	private static void printList(List<Student> studentList){
		for(Student stud: studentList){
			System.out.println("Fname"+stud.getFirstName());
			System.out.println("####Sname"+stud.getSecondName());
			System.out.println("####Age"+stud.getAge());
		}
	}
	

}
