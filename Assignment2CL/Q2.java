public class Q2
{
    public static void main(String[] args) 
    {
        int a,b,c;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=(int)Math.pow(b , a);
        System.out.println("b^a is "+c);
    }
}