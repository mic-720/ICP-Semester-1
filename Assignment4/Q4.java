import java.util.*;
public class Q4
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a=s.nextInt();
		int copya=a;
		System.out.print("Enter the second number : ");
		int b=s.nextInt();
		int copyb=b;
		int rem;
		do
		{
			rem=a%b;
			a=b;
			b=rem;
		}
		while(rem>0);
		System.out.println("GCD of "+copya+" and "+copyb+" is "+a);
	}
}