package com.training.adi;

public class PermanentEmployee extends Employee{
	private int pfPercentage;
	private double pfAmount;
	
	public PermanentEmployee(int EmpID, String EmpName, String DeptName, double Salary, int pfPercentage) {
		super(EmpID, EmpName, DeptName, Salary);
		this.pfPercentage = pfPercentage;
	}
		

	public int getPfPercentage() {
		return pfPercentage;
	}

	public void setPfPercentage(int pfPercentage) {
		this.pfPercentage = pfPercentage;
	}
	
	 public void getPF() {
		 double Sal=super.getSalary();
		 pfAmount = (Sal/100)*this.pfPercentage;
	 }

}
