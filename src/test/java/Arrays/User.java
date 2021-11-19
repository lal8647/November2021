package Arrays;

public class User {

	String username;
	int age;
	String city;
	
	
	public static void main(String[] args) {
		
	User u1= new User();
	u1.username= "Lal";
	u1.age=22;
	u1.city="bengalore";
	
	User u2= new User();
	u2.username= "Lal1";
	u2.age=22;
	u2.city="Chennaii";
	
	User u3= new User();
	u3.username= "Lal";
	u3.age=22;
	u3.city="Delhi";
	
	System.out.println(u1.username + " " +u1.age + " " +u1.city);
	System.out.println(u2.username + " " +u2.age + " " +u2.city);    
	System.out.println(u3.username + " " +u3.age + " " +u3.city);
	
	u1=u2;
	
	System.out.println(u1.username + " " +u1.age + " " +u1.city);
	System.out.println(u2.username + " " +u2.age + " " +u2.city);    
	System.out.println(u3.username + " " +u3.age + " " +u3.city);
	
	u2=u3;
	
	System.out.println(u1.username + " " +u1.age + " " +u1.city);
	System.out.println(u2.username + " " +u2.age + " " +u2.city);    
	System.out.println(u3.username + " " +u3.age + " " +u3.city);
	}

}
