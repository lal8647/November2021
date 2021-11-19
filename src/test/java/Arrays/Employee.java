package Arrays;

public class Employee {

	//Class Vars: 
	
	String name;
	int age;
	double salary;
	boolean isActive;
	
	
	public static void main(String[] args) {
		// Class is a entity
		
		//Create object of this class:
		//new keyword:
		
		Employee e1= new Employee();//Object creation
		e1.name="lal";
		e1.age=22;
		e1.salary= 12212;
		e1.isActive=true;
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		System.out.println(e1.isActive);
		
		
		Employee e2= new Employee();//Object creation
		e2.name="Lal1";
		e2.age=22;
		System.out.println(e2.name + " " + e2.age + " ");
	    e2=null;//NullPointerException
	    e2.name= "Testing";
		

	}

}
