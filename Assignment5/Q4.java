import java.util.Scanner;
public class Q4{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int m=s.nextInt();
		System.out.print("Enter Second Number : ");
		int n=s.nextInt();
		int ans=1;
		if(m<n && m>0 && n>0) {
			for(int i=m;i<=n;i++) {
				for(int j=i;j>=1;j--) 
				{
					ans=ans*j;
					
				}
				System.out.println("Factorial of "+i+" is : "+ans);
				ans=1;
			}
		}
	}
}