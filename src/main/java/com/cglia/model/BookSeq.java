package com.cglia.model;
// Generated Jul 25, 2023, 3:22:03 PM by Hibernate Tools 6.0.2.Final

/**
 * BookSeq generated by hbm2java
 */
public class BookSeq implements java.io.Serializable {

	private Long nextVal;

	public BookSeq() {
	}

	public BookSeq(Long nextVal) {
		this.nextVal = nextVal;
	}

	public Long getNextVal() {
		return this.nextVal;
	}

	public void setNextVal(Long nextVal) {
		this.nextVal = nextVal;
	}

}