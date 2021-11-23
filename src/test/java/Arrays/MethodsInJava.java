package Arrays;

public class MethodsInJava {

	//Cannot create a method inside the method
	
	
	public static void main(String[] args) {
		
		//create the object:
		
		MethodsInJava obj= new MethodsInJava();
		obj.test();
        int p= obj.getMarks();
        System.out.println(p);
        
        String s1= obj.getName();
        System.out.println(s1);
        
        int q= obj.sum(10, 300);
        System.out.println(q);
	}

	//1. No input and no return
	//void --does not return any value
	
	public void test() {
		System.out.println("Test Method");
	}
	
	// 2. no input but sine return:
	//return type: int
	public int getMarks()
	{
		System.out.println("get marks");
		
		int total =100;
		int bonus=50;
		int totalMarks= total + bonus;
		return totalMarks;
		
		
	}
	 public String getName() {
		 
		 System.out.println(" get name method");
		 
		 String s ="Name";
		 return s;
	 }
	
	
	//3. Some input and some return:
	 
	 public int sum(int a, int b)
	 {
		 System.out.println("sum method");
		 int z =a+b;
		 return z;
		 
	 }
}



