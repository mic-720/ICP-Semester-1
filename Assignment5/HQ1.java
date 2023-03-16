
public class HQ1 
{
    public static void main(String[] args) {        
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=(i+1);j--)
            {
                System.out.print(j);
            }
            System.out.print("*");
            for(int k=i-1;k>=1;k--)
            {
                System.out.print(k);
            }
            System.out.println();
           
        }
    }
}
