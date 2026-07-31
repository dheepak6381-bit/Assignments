import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // --- Upper equilateral triangle ---
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        // --- Lower inverse equilateral triangle (skip middle row) ---
        for (int i = rows - 1; i >= 1; i--) {
            // Print leading spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
