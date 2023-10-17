package com.training.adi;

public class Employee {
	private String EmpName;
	private int EmpID;
	private String DeptName;
	private double Salary;
	
	public Employee(int EmpID, String EmpName, String DeptName, double Salary) {
		this.EmpID=EmpID;
		this.EmpName=EmpName;
		this.DeptName=DeptName;
		this.Salary=Salary;
	}
	
	public String getEMpName() {
		return EmpName;
	}
	
	public void setEmpName(String empName) {
			this.EmpName = EmpName;
	}

	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int empID) {
		this.EmpID = EmpID;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		this.DeptName = DeptName;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		this.Salary = Salary;
	}

	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpID=" + EmpID + ", DeptName=" + DeptName + ", Salary=" + Salary
				+ "]";
	}
	
	
	
	
}
