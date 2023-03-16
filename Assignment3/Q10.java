import java.util.Scanner;
public class Q10 
{
    public static void main(String[] args) {
        int grade;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Marks Obtained :");
        grade=s.nextInt();
        int exp=grade/10;
        String str=" ";
        switch(exp){
            case 10:
                str="O";
                break;
            case 9:
                str="O";
                break;
            case 8:
                str="A";
                break;
            case 7:
                str="B";
                break;
            case 6:
                str="C";
                break;
            case 5:
                str="D";
                break;
            case 4:
                str="E";
                break;
            default :
                str="F";
                break;
        }
        System.out.println("Grade Secured : "+str);
    }
}
