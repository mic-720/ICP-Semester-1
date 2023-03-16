import java.util.Scanner;
public class Q8 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++) {
				sum=sum+j;
				
			}
			
		}
		System.out.println("The sum of the "+n+" terms of this sequence is : "+sum);
		
	}

}
