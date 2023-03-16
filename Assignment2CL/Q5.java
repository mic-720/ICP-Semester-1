public class Q5
{
    public static void main(String[] args) 
    {
        int a,b,c;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);
        int smallest=Math.min(Math.min(a, b), c);
        int largest=Math.max(Math.max(a, b),c);
        int middle=a+b+c-largest-smallest;
        System.out.print("Increasing Order : ");
        System.out.println(smallest+" "+middle+" "+largest);
    }
}