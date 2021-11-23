package Arrays;

public class StaticMethod {

	
	String name; //Non static variable
	static int age;//static variable
	
	
	public void getName()
	{
		System.out.println("Get name");
	}
	
	public static void getInfo() {
		System.out.println("Get info");
	}
	public static void main(String[] args) {
		
		//how to access non static var and methods:
		//we have to create the object of the class
		
		StaticMethod obj=new StaticMethod();
		obj.name="tom";
		System.out.println(obj.name);
		
		obj.getName();
		
		//how to call static vars and methods:
		//1. call them directly: no need to use the object
		
		age =23;
		//name="pet";
		System.out.println(age);
		//2. you can call them using class name: 
		StaticMethod.age=12;
		System.out.println(age);
		
		
		
			
		

		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
