import java.util.Scanner;
public class HQ5 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=s.nextInt();
		String str="";
		for(int i=1;i<=num;i++) 
		{
			str+=(i+str);
			System.out.println(str);
		}
	}
}
