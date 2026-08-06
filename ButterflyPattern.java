import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // --- Upper wings ---
        for (int i = 1; i <= rows; i++) {
            // Left triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces between wings
            for (int s = 1; s <= 2 * (rows - i); s++) {
                System.out.print(" ");
            }
            // Right triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // --- Lower wings ---
        for (int i = rows; i >= 1; i--) {
            // Left triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces between wings
            for (int s = 1; s <= 2 * (rows - i); s++) {
                System.out.print(" ");
            }
            // Right triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
