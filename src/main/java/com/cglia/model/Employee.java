package com.cglia.model;
// Generated Jul 25, 2023, 3:22:03 PM by Hibernate Tools 6.0.2.Final

/**
 * Employee generated by hbm2java
 */
public class Employee implements java.io.Serializable {

	private Integer id;
	private String name;
	private String occupation;
	private int age;

	public Employee() {
	}

	public Employee(String name, String occupation, int age) {
		this.name = name;
		this.occupation = occupation;
		this.age = age;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
