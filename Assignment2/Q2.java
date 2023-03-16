import java.util.Scanner;
public class Q2 
{
	public static void main(String[] args) 
		{
			int dist;
			Scanner s=new Scanner(System.in);
			System.out.print("Enter The Distance in km=");
			dist=s.nextInt();
			System.out.println(dist+" km is " +dist*1000+ " Meters");
			System.out.println(dist+" km is " +dist*3280.8399+ " Feet");
			System.out.println(dist+" km is " +dist*39370.0787+ " Inch");
			System.out.println(dist+" km is " +dist*100000+ " Centimetres");
		}
}
