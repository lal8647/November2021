package Arrays;

public class Login {

	String username;
	String pwd;
	String title;
	String url;
	
	public static void main(String[] args) {
		
     Login gLogin= new Login();
     gLogin.username="admin";
     gLogin.pwd="admin123";
     gLogin.title="Login";
     gLogin.url="http://www.google.com";
     System.out.println(gLogin.username);
     System.out.println(gLogin.pwd);
		
		Login amazonLogin= new Login();
		amazonLogin.username="lal";
		amazonLogin.pwd="lal123";
		System.out.println(amazonLogin.pwd);
		
		new Login().username= "admin@123.com";//Waste way of coding
		//System.out.println(new Login().username);
		
		
		
		
		
		
		
		
	}

}
