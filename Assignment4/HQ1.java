import java.util.Scanner;
public class HQ1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=s.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			int a = (i*i);
			sum=sum+a;
		}
		System.out.println("The sum of the squares of the first ten natural numbers is: "+sum);
		int sum1=0;
		for(int i=0;i<=n;i++) {
			sum1=sum1+i;
		}
		int c = sum1*sum1;
		System.out.println("The square of the sum of the first ten natural numbers is: "+sum1*sum1);
		System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is "+c+" - "+sum+" = "+(c-sum));
	}
}
