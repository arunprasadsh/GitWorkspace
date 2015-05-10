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
public class CompareByFirstName implements Comparator<Student> {

	public int compare(Student stud1,Student stud2){
		
		return stud1.getFirstName().compareTo(stud2.getFirstName());
		
	}
}
