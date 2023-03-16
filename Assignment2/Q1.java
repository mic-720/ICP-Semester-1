import java.util.Scanner;
public class Q1 {

	public static void main(String[] args)
	{
		double tempc,tempf;
		System.out.print("Enter a degree in fahrenheit:-");
		Scanner s=new Scanner(System.in);
		tempf=s.nextDouble();
		tempc=(tempf-32)*5.0/9;
		System.out.println(tempf+" Fahrenheit is "+tempc+" Celsius ");
	}
}
