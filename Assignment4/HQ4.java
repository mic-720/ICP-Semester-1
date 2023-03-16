import java.util.Scanner;
public class HQ4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=s.nextInt();
		int sum=0,sum1=1;
		for(int i=1;i<=num;) 
		{
			if(i%2==0) {
				sum+=i;
			}
			else {
				sum1*=i;
			}
			i++;
		}
		System.out.println("Sum of all even numbers : "+sum);
		System.out.println("Product of all odd numbers : "+sum1);
	}
}
