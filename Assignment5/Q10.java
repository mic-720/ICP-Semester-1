import java.util.Scanner;
public class Q10 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no. of terms : ");
		int n=s.nextInt();
		int a=0,b=1,c=1,d;
		System.out.print(a+" "+b+" "+c+" ");
		for(int i=1;i<=n-3;i++) 
		{
			d=a+b+c;
			System.out.print(d+" ");
			a=b;
			b=c;
			c=d;
		}
	}
}
