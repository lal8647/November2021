package OOP_Inheritence;

public class TestCar {

	public static void main(String[] args) {
		BMW b= new BMW();
		b.start();//Overridden Method 
		b.stop();//Inherited method
        b.restart();//Inherited method
        b.autoParking();//child class
        BMW.sunRoof();
        
        Car c= new Car();
        c.start();
        c.stop();
        c.restart();
        Car.sunRoof();
        
        Car c1= new BMW();//Child class object can be referred by
        //parent class reference variable
        //called as Top casting:
        
        c1.start();
        c1.restart();
        c1.stop();
        c1.sunRoof();
        
        //down Casting:
        
       // BMW b1= (BMW)new Car();//ClassCaseException
        
        
        
	}

}
