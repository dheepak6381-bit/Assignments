import java.util.Scanner;

public class amstrongnum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int length = String.valueOf(num).length();
        int sum = 0;
        while (temp>0)
        {
            int digit = temp % 10;
            sum =  sum + (int)Math.pow(digit,length);
            temp = temp/10;

        }
    if (num == sum)
    {
        System.out.println("it is a amstrong number: "+num);
    }
    else
    {
        System.out.println("it is not a amstrong number: "+num);
    }

    }
}