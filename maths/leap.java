import java.util.Scanner;

public class leap
{
    public static void main (String[] args)
    {
        Scanner harish = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = harish.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 4 != 0))
        {
            System.out.println("This is leap year:"+year);
        }
        else
        {
            System.out.println("This is not a leap year:"+year);
        }

        harish.close();
    }

}
