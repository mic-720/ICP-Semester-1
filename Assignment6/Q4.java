public class Q4 
{
    public static int numberOfDaysInAYear(int year){
        int days=365;
        if((year%100==0 && year%400==0) || (year%100!=0 && year%4==0)){
            days=366;
        }
        return days;
    }
    public static void main(String[] args) 
    {
        for(int i=2000;i<=2020;i++)
        {
            System.out.println("Number of days in the year "+i+" are "+numberOfDaysInAYear(i));
        }
    }   
}
