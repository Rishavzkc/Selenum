package PredicateMtd;

import java.util.Scanner;
import java.util.function.Predicate;

public class AuthenticationExmp {

	String username;
	String pwd;
	
	public AuthenticationExmp(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}
}
class Test{
	public static void main(String[] args) {
		Predicate <AuthenticationExmp> p = u ->u.username.equals("rishav")&& u.pwd.equals("java");
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter Username: ");
		String username =sc.next();
		
		System.out.println("Enter Password : ");
		String pwd = sc.next();
		
		AuthenticationExmp user = new AuthenticationExmp(username, pwd );
		if (p.test(user)) {
			System.out.println("Valid User and Avail all Services");
		}
		else {
			System.out.println("Invalid User and not avail all Services");
		}
		
	}
}
