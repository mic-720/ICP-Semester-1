import java.util.Scanner;
public class Q1 
{
    public static void main(String[] args)
    {
    	Scanner s=new Scanner(System.in);
    	System.out.print("Enter First Number : ");
        int a=s.nextInt();
        System.out.print("Enter Second Number : ");
        int b=s.nextInt();
        int sum=0;
        for(int i=1;i<=a/2;i++)
        {
            if(a%i==0)
            {
                sum+=i;
            }
        }
        if(b==sum){
            System.out.println(a+" and "+b+" are Amicable number ");
        }
        else {
        	System.out.println(a+" and "+b+" are not Amicable number ");
        	
        }
    }

}
