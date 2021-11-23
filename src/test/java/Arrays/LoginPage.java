package Arrays;

public class LoginPage {

	public static void main(String[] args) {
		
		LoginPage lp= new LoginPage();
		lp.login(10, 29);

	}

	//Method Overloading(compile time poly):-->>Polymorphism
	// Within the same class, 
	// using different method with the same name but 
	//sequence of different parameters
	
	    public void login() {
		System.out.println("Login to app");
	}
	
	   public void login(int a) {
		
	}
	
	   public void login(int a, int b) {
		
	}
	
	   public void login(int a, String b) {
		
	}
       public void login(String a, int b) {
		
	}
       
       // 
       public void search() {
    	   
       }
       public void search(String name) {
    	   
       }
      public void search(String name, int price) {
    	   
       }
      public void search(String name, int price, String colour) {
   	   
      }
}
