/**
 * 
 */
package com.arun.util;

import java.util.Comparator;

import com.arun.model.Student;

/**
 * @author prabhu
 *
 */
public class CompareStudentByAge implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.getAge() == s2.getAge())
		return 0;
		else if(s1.getAge() > s2.getAge())
			return 1;
		else
			return -1;
	}

}
