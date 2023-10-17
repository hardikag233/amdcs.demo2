package com.training.adi;

public class Student {
	private String studName;
	private int rollNo;
	private String schoolName;
	private int marks;
	
	
	
	public Student(String studName, int rollNo, String schoolName, int marks) {
		this.studName = studName;
		this.rollNo = rollNo;
		this.schoolName = schoolName;
		this.marks = marks;
	}
	
	
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [studName=" + studName + ", rollNo=" + rollNo + ", schoolName=" + schoolName + ", marks="
				+ marks + "]";
	}
	
	
	
	

}
