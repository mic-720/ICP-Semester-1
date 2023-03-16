import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter n : ");
		int n=s.nextInt();
		double d,term,ans=0;
		for(int i=1;i<=n;i++) {
			d=i*i;
			term=1/d;
			ans=ans+term;
		}
		System.out.print("The sum of given series upto "+n+" terms is : "+ans);
	}
}
