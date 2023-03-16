import java.util.Scanner;
public class Q9 
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of a, b,c : ");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>b)
            {
                if(a>c)
                {
                    System.out.println(a+" is the largest number");
                    if(b>c){System.out.println(b+" is the second largest number");}
                    else{System.out.println(c+" is the second largest number");}
                }
                else
                {
                    System.out.println(c+" is the largest number");
                    if(a>b){System.out.println(a+" is the second largest number");} //** */
                    else{System.out.println(b+" is the second largest number");}
                }
            }
        else //b>a
            {
                if(b>c)
                {
                    System.out.println(b+" is the largest number");
                    if(a>c){System.out.println(a+" is the second largest number");}
                    else{System.out.println(c+" is the second largest number");}
                }
                else //b<c
                {
                    System.out.println(c+" is the largest number");
                    if(b>a){System.out.println(b+" is the second largest number");}
                    else{System.out.println(a+" is the second largest number");}
                }
            } 
    }

}
