import java.util.Scanner;
public class Q6 
{
	public static void main(String[] args) 
	{
		double time;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the numbers of seconds:-");
		time=s.nextDouble();
		double g=32.174;
		double dist=0.5*g*time*time;
		System.out.print("Distance Travelled:- "+dist);
	}
}
