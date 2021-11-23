package ConstructorConcept;

import java.util.ArrayList;

public class TestDrive{

	public static void main(String[] args) {
		
		CarDesign car_alto= new CarDesign("Alto", "Red");
            System.out.println(car_alto.name + " " + car_alto.colour);
	       
            ArrayList<String> audiQ5= new ArrayList<String>();
            audiQ5.add("auto parking");
            audiQ5.add("Turbo engline");
            audiQ5.add("sun roof");
            audiQ5.add("parking sensor");
            
	    CarDesign audi_q5= new CarDesign("Audi",86, "Red", 12.2, false, 'Y',audiQ5);
	          System.out.println(audi_q5.name + " " + audi_q5.colour + " " + audi_q5.price);
	          System.out.println(audi_q5.featureList);
	          
	         String f1 = audi_q5.featureList.get(0);
	         System.out.println(f1);
	          
	 
	}

}
