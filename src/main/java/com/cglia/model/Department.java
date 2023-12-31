package com.cglia.model;
// Generated Jul 25, 2023, 3:22:03 PM by Hibernate Tools 6.0.2.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Department generated by hbm2java
 */
public class Department implements java.io.Serializable {

	private Long id;
	private Employ employ;
	private String name;
	private Set employs = new HashSet(0);

	public Department() {
	}

	public Department(Employ employ, String name, Set employs) {
		this.employ = employ;
		this.name = name;
		this.employs = employs;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Employ getEmploy() {
		return this.employ;
	}

	public void setEmploy(Employ employ) {
		this.employ = employ;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getEmploys() {
		return this.employs;
	}

	public void setEmploys(Set employs) {
		this.employs = employs;
	}

}
