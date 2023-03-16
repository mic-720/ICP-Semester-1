import java.util.Scanner;
public class HQ5 {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of Fibonacci numbers you want to print : ");
		int n=s.nextInt();
		int a,b,c;
		a=0;
		b=1;
		System.out.print("Fibonacci Series is : ");
		for(int i=1;i<=n;i++) 
		{
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
		}
	}
}
