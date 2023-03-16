import java.util.Scanner;
public class Q5
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=s.nextInt();
		int sum=0;
		System.out.print("Factors of "+n+" are : ");
		for(int i=1;i<=n/2;i++) 
		{
			if(n%i==0) 
			{
				sum+=i;
			}
		}
		System.out.println();
		System.out.println("Sum of it's factor : "+sum);
		if(n==sum)
			System.out.println(n+" is a perfect number");
		else
			System.out.println(n+" is not a perfect number");
	}
}
