package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> ar= new ArrayList<String>();
	
		ar.add("A");
		ar.add("B");
		ar.add("C");
		
		System.out.println(ar);
		System.out.println(ar.size());
		
		ar.clear();
		System.out.println(ar);
		System.out.println(ar.size());
		ArrayList<String> ar1= new ArrayList<String>();
		
		ar1.add("A");
		ar1.add("B");
		ar1.add("C");
		ar1.add("C");
		
		System.out.println(ar1);
 ArrayList<String> ar2= (ArrayList<String>)ar1.clone();//shallow/clone copy creation
		System.out.println(ar2);
		
		//contains:
		
		System.out.println(ar1.contains("C"));
		System.out.println(ar1.contains("L"));
		
		//indexof
		System.out.println(ar1.indexOf("B"));
		
		ArrayList<String> ar3= new ArrayList<String>(2);
		ar3.add("Test");
		ar3.add("Lal");
		
		System.out.println(ar3);
		
		ar3.ensureCapacity(15);
		
		//for each:jdk 1.8 with lambda
		
		//ar1.forEach(e -> System.out.println(e));
		
		
		ArrayList<String> EmpList= new ArrayList<String>();
		
		EmpList.add("Lal");
		EmpList.add("Mlal");
		EmpList.add("Bal1111");
		EmpList.add("Zlal11111");
		
		
		System.out.println(EmpList);
		
		Collections.sort(EmpList);// Sorting
		System.out.println(EmpList);
		
		Collections.sort(EmpList, Collections.reverseOrder()); //Reverse order
		
		
		
		
		
		
		
		
	}

}
