import java.util.Scanner;
public class Q2
{
	public static int isPrime(int n,int flag) {
		if(n<2) {
			flag=1;
		}
		for(int i=2;i<=n/2;i++) 
		{
			if(n%i==0) 
			{
				flag=1;
			}
			
		}
		return flag;
	}
	public static int reverseNum(int n) {
		int ans=0;
		while(n>0) 
		{
			int rem=n%10;
			ans=ans*10+rem;
			n=n/10;
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=s.nextInt();
		int flag=0;
		int rev=reverseNum(num);
		if(isPrime(num,flag)==0 && isPrime(rev,flag)==0) {
			System.out.print(num+" is a twisted prime number ");
			
		}
		else {
			System.out.print(num+" is not a twisted prime number ");

		}
		
		
		
	}
	
}