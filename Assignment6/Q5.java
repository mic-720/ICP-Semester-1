//program to calculate the area of a regular n sided polygon 
import java.util.Scanner;
public class Q5{
  public static double area(int n, double side)
  {
    double area;
    area=(n*side*side)/(4*Math.tan(Math.PI/n));
    return area;
  }
  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Number of sides : ");
    int n=s.nextInt();
    System.out.print("Enter side length : ");
    int side=s.nextInt();
    System.out.println("The area of "+n+" sided polygon having side length of "+side+" is : "+area(n, side));
  }

}