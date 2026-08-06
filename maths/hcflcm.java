import java.util.Scanner;

public class hcflcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int x = a;
        int y = b;

        // Find HCF using Euclidean Algorithm
        if (y != 0) {
            int r = x%y;
            x = y;
            y = r;
        }

        int hcf = y;
        int lcm = (a * b) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);

        sc.close();
    }
}