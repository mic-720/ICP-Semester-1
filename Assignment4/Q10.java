import java.util.Scanner;
public class Q10
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=s.nextInt();
		double ans=1;
		for(int i=0;ans<=num;i++) 
		{
			ans=ans*3;
		}
		int a = (int)ans/3;
		System.out.println("The largest power of 3 less than or equal to "+num+" is "+a);
	}
}
