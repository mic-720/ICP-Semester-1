import java.util.Scanner;
public class Q6
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the base : ");
		int base=s.nextInt();
		System.out.print("Enter the power : ");
		int power=s.nextInt();
		int ans=1;
		for(int i=1;i<=power;i++) 
		{
			ans=ans*base;
			
		}
		System.out.println(power+" to the power "+base+" is : "+ans);
		s.close();
		
	}

}
