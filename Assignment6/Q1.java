import java.util.Scanner;
public class Q1 
{
    public static int additionSimple(int x,int y){
        int c=x+y;
        return c;
    }
    public static int substractionSimple(int x,int y){
        int c=x-y;
        return c;
    }
    public static int multiplicationSimple(int x,int y){
        int c=x*y;
        return c;
    }
    public static int divisionSimple(int x,int y){
        int c=x/y;
        return c;
    }
    public static int remainderSimple(int x,int y){
        int c=x%y;
        return c;
    }
    public static double squareRootSimple(int n){
        double c=Math.sqrt(n);
        return c;
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int x=s.nextInt();
        int y=s.nextInt();
        System.out.print("Enter operator(+,-,*,/,%,@) : ");
        char c=s.next().charAt(0);
        int ans;
        switch(c){
            case '+':
            ans=additionSimple(x, y);
            System.out.println(x+""+c+""+y+"="+ans);
            break;

            case '-':
            ans=substractionSimple(x, y);
            System.out.println(x+""+c+""+y+"="+ans);
            break;

            case '*':
            ans=multiplicationSimple(x, y);
            System.out.println(x+""+c+""+y+"="+ans);
            break;

            case '/':
            ans=divisionSimple(x, y);
            System.out.println(x+""+c+""+y+"="+ans);
            break;

            case '%':
            ans=remainderSimple(x, y);
            System.out.println(x+""+c+""+y+"="+ans);
            break;

            case '@':
            if(x<0){
                System.out.println("Square root of "+x+" not defined ");
            }
            else{
            System.out.println("Square root of "+x+"="+squareRootSimple(x));
            }
            break;
            default:
            System.out.println("Enter correct operator");
        }
    }
}
