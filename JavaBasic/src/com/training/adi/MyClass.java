package com.training.adi;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MyClass {
	public static void main(String[] args) {
		
		/*Student stud1 = new Student();
		stud1.setStudName("Hardik");
		stud1.setRollNo(23);
		stud1.setSchoolName("BBPS");
		stud1.setMarks(94);*/
		
		/*PermanentEmployee p1 = new PermanentEmployee(201,"Harshit","Finance",85000,12);
		p1.getPF();
		System.out.println("Pf Amount: "+p1.pfAmount);*/
		
		/*System.out.println(stud1.getStudName());
		System.out.println(stud1.getRollNo());
		System.out.println(stud1.getSchoolName());
		System.out.println(stud1.getMarks());*/
		
		//System.out.println(stud2.toString());
		
		/*Account s1 = new SavingsAccount();
		System.out.println("Savings Interest AMount: "+s1.calcInterest(50000));
		
		Account c1 = new CheckingAccount();
		System.out.println("Checking Interest Amount: "+c1.calcInterest(50000));*/
		
		List <Employee> empList = new ArrayList <> ();
		empList.add(new Employee(101, "Hardik", "Sales", 65000));
		empList.add(new Employee(102, "Arsh", "Finance", 75000));
		empList.add(new Employee(103, "Aman", "Sales", 55000));
		empList.add(new Employee(104, "Harshit", "HR", 60000));
		
		
		
		/*List<Employee> empA = new ArrayList<>();
		
		for(Employee emp:empList) {
			if(emp.getEMpName().startsWith("A")) {
				empA.add(emp);
			}
		}
		
		System.out.println("Employees with First Letter A:");
		for(Employee emp:empA) {
			System.out.println(emp);
		}*/
		
		//Collections.sort(empList);  //needs comparable interface
		
		Collections.sort(empList, new NameComparator());
		for(Employee emp:empList) {
				System.out.println(emp);
		}
	}

}
