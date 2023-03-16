import java.util.*;
public class Q8
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Random ran=new Random();
		int user,cg;
		do {
			System.out.print("User guess : ");
			user=s.nextInt();
			cg=ran.nextInt(10+1-1)+1;
			System.out.println("Computer guess : "+cg);
			if(user-cg>0)
				{System.out.println("Too high,try again");
				}
			else if(user==cg)
				{System.out.println("Good guess");
				}
			else
				{System.out.println("Too low,try again");
				}
			System.out.println();
		}
		while(user!=cg);
	}
}