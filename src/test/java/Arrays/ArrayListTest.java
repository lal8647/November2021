package Arrays;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
	
		ArrayList<Object> ar=new ArrayList<Object>();
		
		ar.add(100);
		ar.add("Testing");
		
		System.out.println(ar.get(1));
		
		//generics in ArrayLists: 
		//Int type of ArrayLists
		ArrayList<Integer> marksList= new ArrayList<Integer>();
		
		marksList.add(100);//0
		marksList.add(10012);//1
		marksList.add(10014);//2
		marksList.add(10016);//3
		
		System.out.println(marksList.get(1));
		//System.out.println(marksList.get(4));//IndexOutOfBoundsException:
		
		ArrayList<String> namesList=new ArrayList<String>();
		namesList.add("Lal");
		namesList.add("Pete");
		namesList.add("Naa");
		namesList.add("Petere");
		
		
		
		System.out.println(namesList.size());
		//namesList.remove(2);
		System.out.println(namesList.size());
		System.out.println(namesList.get(2));
		
		for(int i=0; i<namesList.size(); i++) {
			System.out.println(namesList.get(i));
		}
		
		for (String e: namesList) {
			System.out.println(e);
		}
		
		
		
		
		

	}

}
