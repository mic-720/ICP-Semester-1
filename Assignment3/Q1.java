import java.util.Scanner;
public class Q1
{
    public static void main(String[] args) 
    {
        int age;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter you age :");
        age=s.nextInt();
        if(age>=18)
            System.out.println("You are eligible to cast your vote");
        else
            System.out.println("You are not eligible to vote");
    }
}