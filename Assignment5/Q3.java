import java.util.Scanner;
public class Q3{
	public static boolean isPrime(int num) 
	{
		if(num<2) 
		{
			return false;
		}
		for(int i=2;i<=num/2;i++) 
		{
			if(num%i==0) 
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first number : ");
		int first = s.nextInt();
		System.out.print("Enter second number : ");
		int second = s.nextInt();
		System.out.print("Prime numbers between "+first+" and "+second+" are : ");
		for(int i=first+1;i<second;i++) {
			if(isPrime(i)) 
			{
				System.out.print(i+" ");
			}
		}
		
	}
}