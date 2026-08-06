import java.util.Scanner;

public class sum
{
    public static void main(String[] args) {
        Scanner harish = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = harish.nextInt();

        System.out.println("Enter the second number");
        int num2 = harish.nextInt();  

        int sum = num1 + num2;

        System.out.println("The sum of two numbers is:"+sum);



    }
}