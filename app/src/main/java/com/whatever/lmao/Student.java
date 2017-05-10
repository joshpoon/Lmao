package com.whatever.lmao;

/**
 * Created by SDG on 25/4/2017.
 */

public class Student {
	private String name;
	private int grade;
	private String status;
	private boolean isBoy;
	private String DOB;

	public Student() {
		name = "";
		status = "";
		DOB = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isBoy() {
		return isBoy;
	}

	public void setBoy(boolean boy) {
		isBoy = boy;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
	}

	@Override
	public String toString() {
		return getName() + "\n" + getGrade() + "\n" + getStatus() + "\n" + (isBoy() ? "Boy" : "Girl") + "\n" + getDOB();
	}
}
