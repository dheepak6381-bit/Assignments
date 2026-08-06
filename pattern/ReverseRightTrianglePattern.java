import java.util.Scanner;

public class ReverseRightTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Loop to print the inverted right-side triangle
        for (int i = rows; i >= 1; i--) {
            // Print spaces first
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to next line
        }

        sc.close();
    }
}
