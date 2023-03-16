import java.util.Scanner;
public class HQ3 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of x in radian : ");
		double x=s.nextDouble();
		double sum=0;
		int i=1;
		double t=x;
		do {
			sum=sum+t;
			i=i+2;
			t=((-t)*x*x)/(i*(i-1));
		}
		while(Math.abs(t)>=0.000001);
		System.out.println("Sin("+x+")="+sum);
	}

}
