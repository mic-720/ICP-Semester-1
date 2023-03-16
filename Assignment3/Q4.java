import java.util.Scanner;
import java.util.Random;
public class Q4 
{
    public static void main(String[] args) 
    {
        int comp,user;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter User Number :");
        user=s.nextInt();
        Random ran=new Random();
        comp=ran.nextInt(1+9-1)+1;
        System.out.println("Computer Guesses :"+comp);
        
        if(comp==user)
            {System.out.println("\"You got it right\"");}
        else if(Math.abs(user-comp)==1)
            {System.out.println("\"Almost got it\"");}
        else
            {System.out.println("\"You got it Wrong\"");}
    }
}
