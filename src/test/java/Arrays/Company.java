package Arrays;

import java.util.ArrayList;

public class Company {
    
	String name;
	int empCount;
	
	public static void main(String[] args) {
		Company comp= new Company();
		String a= comp.getCEOName();
		System.out.println(a);
		
		int b= comp.getTotalCount();
		System.out.println(b);
		
		String founderArr[]= comp.getCoFounders();
		System.out.println(founderArr.length);
		for (String e: founderArr) {
			System.out.println(e);
		}
		
		ArrayList<String> cust= comp.getCustomerList();
		System.out.println("total number of customers: " + cust.size());
		for (String e: cust) {
			System.out.println(e);
		}

	}

	public ArrayList<String> getCustomerList() {
		System.out.println("Get customer List");
		
		ArrayList<String> custList=  new ArrayList<String>();
		custList.add("Pepsi");
		custList.add("Cola");
		
		return custList;
		
	}
	public String getCEOName() {
		return "Tom";
		
	}
	
	public int getTotalCount() {
		System.out.println("getTotalCount");
		int totalShare= 2000;
		
		return totalShare;
	}
	
	public String[] getCoFounders() {
		
		System.out.println(" get cofounders");
		
		String founder[] =new String [3];
		founder[0] ="tom";
		founder[1]= "lal";
		founder[2]= "Ste";
		
		return founder;
		
	}
}
