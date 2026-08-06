import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println((num >= 0) ? "The number is positive." : "The number is negative.");
    }
}
