package com.methodOverriding;

/**
 * 
 * Polymorphism: One entity in many forms
 * ============
 *
 */

//sub/derived/child class
public class Employee extends Organization
{
	
	//variables(state)
	double salary;
	
	static String deptName;

	//constructors
	public Employee() 
	{
		id = 3939;
		name = "Ajay";
		salary = 48474.45;
	}

	//blocks
	static
	{
		deptName = "Development";
	}
	
	//methods(behavior)
	public void getInformation()//overrides com.polymorphism.Organization.getInformation()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptName);
	}
	
	//main
	public static void main(String[] args) 
	{ 
		//objects
		Employee employee = new Employee();
		employee.getInformation();
		
		System.out.println("==============");
		
		Organization organization = new Organization();
		organization.getInformation();
		
	}	
	

}
