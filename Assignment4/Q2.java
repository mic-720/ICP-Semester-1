import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=s.nextInt();
		int num=n;
		int sum=0;
		while(n>0) 
		{
			int rem=n%10;
			sum=sum+rem;
			n/=10;
		}
		System.out.println("Sum of it's digits : "+sum);
		if(sum%9==0)
			System.out.println(num+" is divisible by 9");
		else
			System.out.println(num+" is not divisible by 9");
		
	}

}
