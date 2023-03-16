import java.util.Scanner;
public class Q2 
{
    public static void main(String[] args) 
    {
        int x;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the amount of water drank(in ml) :");
        x=s.nextInt();
        if(x>=5000)
            {
                System.out.println("Yes, Alice is following doctor's advice");
            }
        else
            {
                System.out.println("No, Alice is not following doctor's advice ");
            }


        
    }
    
}
