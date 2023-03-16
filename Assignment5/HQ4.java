import java.util.Scanner;
public class HQ4 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of x : ");
		double x = s.nextDouble();
		double t,sum=0;
		t=1;
		int i=2;
		do {
			sum=sum+t;
			t=((-t)*x*x)/(i*(i-1));
			i=i+2;
		}
		while(Math.abs(t)>=0.000001);
		System.out.println("Cos("+x+")="+sum);
		
		
	}

}
