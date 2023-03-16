import java.util.Scanner;
public class Q9{
	public static boolean validity(String pwd) {
		if(pwd.length()<8)
		{return false;}
		
		int numDigits=0;
		for(int i=0;i<pwd.length();i++) 
		{
			char c=pwd.charAt(i);
			if(!Character.isLetterOrDigit(c)) {return false;}
			if(Character.isDigit(c)) {numDigits++;}
			
		}
		if(numDigits<2) {return false;}
		
		return true;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Your Password : ");
		String pwd=s.next();
		if(validity(pwd))
		{
			System.out.println("Valid Password");
		}
		else 
		{
			System.out.println("Invalid Password");
		}
	}
	
}