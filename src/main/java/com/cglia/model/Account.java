package com.cglia.model;
// Generated Jul 25, 2023, 3:22:03 PM by Hibernate Tools 6.0.2.Final

import java.math.BigDecimal;

/**
 * Account generated by hbm2java
 */
public class Account implements java.io.Serializable {

	private Integer id;
	private Branch branch;
	private String accountNumber;
	private BigDecimal balance;
	private String fullName;

	public Account() {
	}

	public Account(Branch branch, String accountNumber, BigDecimal balance, String fullName) {
		this.branch = branch;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.fullName = fullName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}