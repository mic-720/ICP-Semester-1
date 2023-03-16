import java.util.Scanner;
public class Q3 
{   
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.print("Input First Number :");
        a=s.nextInt();
        System.out.print("Input Second Number :");
        b=s.nextInt();
        System.out.print("Input Third Number :");
        c=s.nextInt();
        if(a<b)
            {
                if(b<c)
                    {System.out.println("Increasing");}
                else
                    {System.out.println("Neither increasing nor decreasing");}
            }
        else
            {
                if(b>c)
                {System.out.println("Decreasing");}
                else
                {System.out.println("Neither increasing nor decreasing");}
            }
    }
}
