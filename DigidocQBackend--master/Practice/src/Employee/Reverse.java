package Employee;

public class Reverse {

	public static void main(String[] args) {
		String a ="Quest Global ";
		String b =" ";
		char ch;
		for (int i =0; i<a.length() ; i++) {
			ch= a.charAt(i);
			b =b+ch;
			
		}
		System.out.println(b);

		StringBuilder c =new StringBuilder ("Quest Global");
c.reverse();
System.out.println(c);
	}

}
