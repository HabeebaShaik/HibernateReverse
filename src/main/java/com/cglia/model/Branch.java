package com.cglia.model;
// Generated Jul 25, 2023, 3:22:03 PM by Hibernate Tools 6.0.2.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Branch generated by hbm2java
 */
public class Branch implements java.io.Serializable {

	private Integer id;
	private String branchCode;
	private Set accounts = new HashSet(0);

	public Branch() {
	}

	public Branch(String branchCode, Set accounts) {
		this.branchCode = branchCode;
		this.accounts = accounts;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public Set getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set accounts) {
		this.accounts = accounts;
	}

}
