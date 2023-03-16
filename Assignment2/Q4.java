import java.util.Scanner;
public class Q4
{
	public static void main(String args[])
	{
		System.out.print("Enter a number between 0 and 1000:-");
		int num,sum=0,x,y,z,t;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		x=num%10;    //Last digit
		y=num/10;
		z=y%10;		 
		t=y/10;
		sum=sum+x+z+t;
		System.out.print("The sum of the digits is:-"+sum);
	}
}