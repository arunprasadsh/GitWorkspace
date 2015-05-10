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
public class CompareBySecondName implements Comparator<Student> {
	
	public int compare(Student stud1,Student stud2){
		return stud1.getSecondName().compareTo(stud2.getSecondName());
	}

}
