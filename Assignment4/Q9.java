import java.util.Scanner;
public class Q9 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=s.nextInt();
		int copyofnum=num;
		int ans=0;
		double rem=1;
		for(int i=0;num>0;)
		{
			rem=num%10;
			ans+=(int)Math.pow(10, i)*rem;
			num/=10;
			if(rem>0){
				i++;
			}
		}
		System.out.println("After removing 0 from the number "+copyofnum+", the new number is "+ans);
	}
}
