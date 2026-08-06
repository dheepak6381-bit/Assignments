import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Find HCF using Euclidean algorithm
        int a = num1, b = num2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int hcf = a;

        // Find LCM using formula: (num1 * num2) / HCF
        int lcm = (num1 * num2) / hcf;

        // Output results
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close();
    }
}
