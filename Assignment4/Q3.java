import java.util.Scanner;
public class Q3
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=s.nextInt();
		double sum=0;
		int i=1;
		System.out.print("Random numbers generated are : ");
		do 
		{
			int r=1+(int)(Math.random()*(n-1+1));
			System.out.print(r+" ");
			sum+=r;
			i++;
		}
		while(i<=n);
		System.out.println();
		System.out.println("Average of "+n+" random integers are "+sum/n);
	}
}