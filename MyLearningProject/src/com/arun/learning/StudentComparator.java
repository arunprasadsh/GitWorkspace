/**
 * 
 */
package com.arun.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.arun.model.Student;
import com.arun.util.CompareByFirstName;
import com.arun.util.CompareByFullName;
import com.arun.util.CompareBySecondName;
import com.arun.util.CompareStudentByAge;

/**
 * @author prabhu
 *
 */
public class StudentComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Arun","Prasad",24));
		studentList.add(new Student("Arun","Prasad",25));
		studentList.add(new Student("Hardik","Pandya",26));
		studentList.add(new Student("Parthiv","Ptael",23));
		System.out.println("Sort By Age Bfore");
		printList(studentList);
		Collections.sort(studentList,new CompareStudentByAge());
		System.out.println("Sort By Age Bfore");
		printList(studentList);
		System.out.println("Sort By First Name bfore");
		printList(studentList);
		Collections.sort(studentList,new CompareByFirstName());
		System.out.println("Sort By First Name after");
		printList(studentList);
	
		System.out.println("Sort By Second Name bfore");
		printList(studentList);
		Collections.sort(studentList,new CompareBySecondName());
		System.out.println("Sort By Second Name after");
		printList(studentList);
		System.out.println("Sort By Full Name bfore");
		printList(studentList);
		Collections.sort(studentList,new CompareByFullName());
		System.out.println("Sort By Full after");
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
