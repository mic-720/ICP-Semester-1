import java.util.Scanner;
public class Q7
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("--Multiplication Table--");
		System.out.print("Enter the number : ");
		int num=s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
		s.close();
	}

}
