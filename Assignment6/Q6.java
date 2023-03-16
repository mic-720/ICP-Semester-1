import java.util.Scanner;
public class Q6 
{
	public static int count(String str,char a) 
	{
		int cv=0;
		for(int i=0;i<str.length();i++) 
		{
			char c=str.charAt(i);
			if(a==c) 
			{
				cv++;
			}
		}
		return cv;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=s.nextLine();
		System.out.print("Enter the character : ");
		char c=s.next().charAt(0);
		int ans =count(str,c);
		System.out.println("char "+c+" occurs "+ans+" in "+" ("+str+")");
		
	}

}
