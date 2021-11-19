package Arrays;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// ArrayList--Dynamic Array
		//ArrayList is a class
		//its an index based collection--Linear collection

		ArrayList ar= new ArrayList();
		System.out.println(ar.size()); //0
		
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());
		ar.add(300);//2
		ar.add(400);//3
		ar.add(400);//4
		ar.add(400);//5
		System.out.println(ar.size());
		//how to print all the values from arraylis: for loop
		
		for (int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
			
		}
		
		//for each loop:
		
		for(Object e :ar) {
			System.out.println(e);
		}
		
	}

}
