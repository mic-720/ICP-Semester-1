import java.util.Scanner;
public class Q5
{
	public static void main(String args[]) 
	{
		double radius;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter The Radius Of Hemisphere:-");
		radius=s.nextDouble();
		double SA=3*radius*radius*Math.PI;
		double Vol=(2*radius*radius*radius*Math.PI)/3;
		System.out.println("The Surface Area Of Hemisphere is:-"+SA);
		System.out.println("The Volume Of Hemisphere is:-"+Vol);
	}
}