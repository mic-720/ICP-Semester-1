import java.util.Scanner;
public class Q6 
{
    public static void main(String[] args) 
    {
        double unit;
        Scanner s=new Scanner(System.in);
        System.out.print("No. of units consumed :");
        unit=s.nextDouble();
        double TotalAmount;
        if(unit<=50){
                TotalAmount=unit*3;
            }
        else if(unit>50 && unit<=200){
                TotalAmount=150 + (unit-50)*4.80;
            }
        else if(unit>200 && unit<=400){
                TotalAmount=150+720+(unit-200)*5.80;
            }
        else{
                TotalAmount=150+720+1160+(unit-400)*6.20;
            }
        System.out.println("Total Amount : "+TotalAmount);
    }
}
