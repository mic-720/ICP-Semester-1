public class Q7 
{
    public static void main(String args[])
    {
        int a,b,c;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);
        if(a<=(b*c) || b<=(a*c) || c<=(a*b))
            {System.out.println("True");}
        else
            {System.out.println("false");}
    }
    
}
