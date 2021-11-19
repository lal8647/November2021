package Arrays;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		
		//Key-value pair
		//Default capacity--16
		
		HashMap<String, String> empMap= new HashMap<String, String>();
		
        empMap.put("A", "Tom");
		empMap.put("B", "Bom");
		empMap.put("C", "Aom");
		empMap.put("D", "Mom");
		
		System.out.println(empMap.get("B"));
		System.out.println(empMap.size());
        
		
		
		
		
		
		
	}

}
