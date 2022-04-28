package com.constructorOverloading;

//Constructor overloading: constructor name is same but change in parameters
public class Employee 
{
	//variables(state)
      int id;
      String name;
      double salary;

  	
      static String deptname;
        

  	//default constructor(without parameters
      public Employee()
      {
    	  id=2202;
    	  name="CharlesKennedyNivetha";
    	  salary=23543.03;
    	  }
      
    //parameterized constructor(with parameters)
      public Employee(int id,String name, Double salary)
      {
    	  this.id=2202;
    	  this.name="CharlesKennedyNivetha";
    	  this.salary=23543.03;
    	  }
      
    //blocks
      static
      {
    	 deptname = "Development";
    	 
      }
      
    //methods without parameters
      public void getInformation() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptname);
		
	}
     
	public static void main(String[] args)
	{
		
		//objects
       Employee employee=new Employee();
       employee.getInformation();
       
       
       
       System.out.println("======================");
         
       
	Employee employee1= new Employee(2202,"CharlesKennedyNivetha",23543.03);
       employee1.getInformation();
       
	}

}
