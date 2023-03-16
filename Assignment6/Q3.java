import java.util.Scanner;
public class Q3 
{
    public static int reverse(int number){
        int rev=0;
        while(number>0){
            rev=rev*10+number%10;
            number=number/10;
        }
        return rev;
    }
    public static boolean isPalindrone(int num){
        int rev=reverse(num);
        if(rev!=num){
            return false;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a=s.nextInt() ;
        int ans=reverse(a);
        System.out.println("Reverse of "+a+" is : "+ans);
        System.out.println(a+" is palindrone : "+isPalindrone(a));
    }
    
}
