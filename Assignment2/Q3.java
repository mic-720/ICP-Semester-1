import java.util.Scanner;
public class Q3 {

	public static void main(String[] args)
	{
		Double sal,DA,HRA,GrossSal;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Basic Salary:-");
		sal=s.nextDouble();
		DA=sal*0.40;
		HRA=sal*0.20;
		GrossSal=sal+DA+HRA;
		System.out.println("Dearness Allowance:-"+DA);
		System.out.println("House Rent Allowance:-"+HRA);
		System.out.println("Gross Salary:-"+GrossSal);
		
		
		
		
		
		

	}

}
