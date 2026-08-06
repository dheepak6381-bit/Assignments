import java.util.Scanner;

public class maxof2num
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int num2 = sc.nextInt();

        if (num1>num2){
            System.out.println("number 1 is bigger: "+num1);
        }
        else{
            System.out.println("number 2 is bigger: "+num2);
        }
    }
}