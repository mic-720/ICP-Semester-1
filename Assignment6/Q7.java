import java.util.Scanner;
public class Q7 
{
	public static int count(String str) {
		String vowels="aeiou";
		String Vowels="AEIOU";
		int num=0;
		for(int i=0;i<vowels.length();i++) 
		{
			char v=vowels.charAt(i);
			char V=Vowels.charAt(i);
;			for(int j=0;j<str.length();j++) 
			{
				char ch=str.charAt(j);
				if(v==ch || V==ch) 
				{
					num++;
				}
			}
		}
		return num;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=s.nextLine();
		int ans=count(str);
		System.out.println("No. of vowels present in "+str+" are : "+ans);
		
	}

}
