package com.infy.test;

import com.infy.models.Employee;

public class TestLombok {

	public static void main(String [] args) {
		
		Employee emp = new Employee();
	
		Employee emp2 = new Employee(20,"Sham","Mumbai");
		Employee emp3 = new Employee(20,"Sham","Mumbai");
		
		emp.setEmpId(10);
		emp.setEmpName("Ram");
		emp.setEmpAddress("Pune");
		
		System.out.println(emp);
		System.out.println("Employee Id  : "+emp.getEmpId());
		System.out.println("Employee Name : "+emp.getEmpName());
		System.out.println("Employee Address : "+emp.getEmpAddress());
		
		System.out.println(emp.hashCode());
		
		System.out.println(emp2.equals(emp3));

		
		Employee emp4 = Employee.builder()
				.empId(30)
				.empName("Awade")
				.empAddress("Dubai")
				.build();
		
		System.out.println(emp4);
	}
}
