package com.arun.util;

import java.util.Comparator;

import com.arun.model.Student;

public class CompareByFullName implements Comparator<Student> {

	@Override
	public int compare(Student stu1, Student stu2) {
		// TODO Auto-generated method stub
		StringBuilder fullNameBuilder1 = new StringBuilder();
		StringBuilder fullNameBuilder2 = new StringBuilder();
		fullNameBuilder1.append(stu1.getFirstName()).append(stu1.getSecondName());
		fullNameBuilder2.append(stu2.getFirstName()).append(stu2.getSecondName());
		return fullNameBuilder1.toString().compareTo(fullNameBuilder2.toString());
	}

}
