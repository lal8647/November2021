package ConstructorConcept;

public class Employee {

	String name;
	int age;
	String dob;
	String city;
	boolean isPermanent;
	
	//constructor: 
	//name of the constructor..will be same as class name
	
	/*public Employee() {
		System.out.println("default constructor...");
	}
	public Employee(int a) {
		System.out.println("1 param constructor.." +a);
	}
	public Employee(int a, int b) {
		System.out.println("2 param constructor.." + a+b);
	}
	*/
	public Employee() {
		
	}
	
	public Employee(String name) {
		this.name= name;
	}
	
	public Employee(String name, int age) {
		this.name=name;
		this.age= age;
		
	}
	
	
	public Employee(String name, boolean isPermanent) {
		this.name = name;
		this.isPermanent = isPermanent;
	}

	public Employee(String name, int age, String dob, String city, boolean isPermanent) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.city = city;
		this.isPermanent = isPermanent;
	}

	public static void main(String a[]) {
		
		Employee obj=new Employee("tom");
		System.out.println(obj.name);
		Employee obj1= new Employee("Lisa", 22);
		System.out.println(obj1.name + " " + obj1.age);
		
		Employee obj2= new Employee("Peter", 33, "10-01-1990", "bang", true);
		System.out.println(obj2.name +" " + obj2.isPermanent);
	}
}
