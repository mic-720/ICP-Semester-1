public class Q1{
    public static void main(String[] args){
        int a,b;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        int quo=a/b;
        int rem=a%b;
        System.out.println("Quotient : "+quo);
        System.out.println("Remainder : "+rem);
    }
}