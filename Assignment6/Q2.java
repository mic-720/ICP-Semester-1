public class Q2{
    public static int getPentagonalNumber(int n)
    {
        int c=((3*n-1)*n)/2;
        return c;

    }
    public static void main(String[] args) {
        int n=100;
        for(int i=1;i<=n;i++)
        {
            int ans=getPentagonalNumber(i);
            System.out.print(ans+" ");
            if(i%10==0){
                System.out.println();
            }
        } 
    }
}