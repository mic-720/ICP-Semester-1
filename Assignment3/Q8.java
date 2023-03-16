import java.util.Scanner;
public class Q8
{
	public static void main(String args[])
	{
		Float x,y;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter x coodinate :");
		x=s.nextFloat();
		System.out.print("Enter y coodinate :");
		y=s.nextFloat();
		if(x>0 && y>0)
			{System.out.println("(" +x+ ","+y+") is in I quadarant");}
		else if(x<0 && y>0)
			{System.out.print("("+x+","+y+") is in II quadrant");}
		else if(x<0 && y<0)
			{System.out.print("(" +x+ ","+y+") is in III quadarant");}
		else if(x==0 && y==0)
			{System.out.print("(" +x+ " , "+y+") is the origin");}
		else if(x==0 && y!=0)
			{System.out.print("(" +x+ " , "+y+") is at y axis");}
		else if(x!=0 && y==0)
			{System.out.print("(" +x+ " , "+y+") is at x axis");}
		else
			{System.out.println("(" +x+ ","+y+") is in IV quadarant");}
	}
}