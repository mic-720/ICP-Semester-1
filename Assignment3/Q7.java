import java.util.Scanner;
public class Q7
{
    public static void main(String[] args) 
        { 
            double Amount;
            Scanner s=new Scanner(System.in);
            System.out.print("No. of units consumed : ");
            int unit=s.nextInt();
            double discount;
            if(unit<=50)
                Amount=unit*3;
            else if(unit<=200) 
                Amount=50*3 + (unit-50)*4.80;
            else if(unit<=400)  
                Amount=(50*3)+(150*4.80)+(unit-200)*5.80;
            else 
                Amount=(50*3)+(150*4.80)+(200*5.80)+(unit-200)*6.20;
            System.out.print("Do you want to pay online(y/n) : ");
            char choice=s.next().charAt(0);
            if(choice=='n' || choice=='N')
                discount=0;
            else
                discount=Amount*0.03;
            System.out.println("Total amount : "+Amount);
            System.out.println("Discount : "+discount);
            System.out.println("Amount payable : "+(Amount - discount));
        }
}
