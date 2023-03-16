import java.util.Scanner;
public class Q8 {
	public static boolean isStringPalindrone(String str) 
	{
		String c="";
		for(int i=str.length()-1;i>=0;i--) 
		{
			c=c+str.charAt(i);
		}
		if(str.equals(c)) {   //use str.equalsIgonreCase(c);
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=s.nextLine();
		String lc=str.toLowerCase();
		boolean ans=isStringPalindrone(lc);
		System.out.println("\""+str+"\" is palindrone : "+ans);
	}

}
