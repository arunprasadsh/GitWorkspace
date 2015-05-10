/**
 * 
 */
package com.arun.model;

/**
 * @author prabhu
 *
 */
public class Student {

	private String firstName;
	private String secondName;
	private int age;
	public String getFirstName() {
		return firstName;
	}

	public Student(String firstName, String secondName, int age) {
	//super();
	this.firstName = firstName;
	this.secondName = secondName;
	this.age = age;
}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
