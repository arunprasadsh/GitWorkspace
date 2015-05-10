/**
 * 
 */
package com.arun.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.arun.model.Student;

/**
 * @author prabhu
 *
 */
public class StudentComparatorChain implements Comparator<Student> {
	private List<Comparator<Student>> comparatorList = new ArrayList<Comparator<Student>>();

	@SafeVarargs
	public StudentComparatorChain(Comparator<Student>... compator){
		this.comparatorList.addAll(Arrays.asList(compator));
	}
	
	public int compare(Student s1,Student s2){
		for(Comparator<Student> comparator:comparatorList){
			int result = comparator.compare(s1, s2);
			if(result!=0){
				return result;
			}
		}
		return 0;
	}
	
	

}
