import java.util.Scanner;
public class Q1 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter First number : ");
		a=s.nextInt();
		System.out.print("Enter Second number : ");
		b=s.nextInt();
		System.out.print("Enter Third number : ");
		c=s.nextInt();
		int sum=0;
		
		for(int i=a; i<=b ;i=i+c  ) {
			sum=sum+i;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("The sum of number displayed is  : "+sum);
	}
}
