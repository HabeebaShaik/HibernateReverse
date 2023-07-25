package com.cglia.model;
// Generated Jul 25, 2023, 3:22:03 PM by Hibernate Tools 6.0.2.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
public class Category implements java.io.Serializable {

	private Integer categoryId;
	private String name;
	private Set products = new HashSet(0);

	public Category() {
	}

	public Category(String name) {
		this.name = name;
	}

	public Category(String name, Set products) {
		this.name = name;
		this.products = products;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

}
