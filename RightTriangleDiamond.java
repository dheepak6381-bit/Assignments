import java.util.Scanner;

public class RightTriangleDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // --- Straight right-side triangle ---
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // --- Inverse right-side triangle (skip middle row) ---
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
