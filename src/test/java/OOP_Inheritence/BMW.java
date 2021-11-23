package OOP_Inheritence;

public class BMW extends Car{

	//Method Overriding
	//When we have a parent class having same method with the same name
	// same parameters in child class
	
	@Override
	public void start()
	{
		System.out.println("BMW---Start");
	}
	
	public void autoParking() {
		System.out.println("BMW--Auto parking");
	}
	
	
	
	
	
	
	
	
	
	
	
}
