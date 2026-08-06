import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to add. Type 'x' to stop:");

        while (true) {
            String input = sc.next();  // Read input as string

            if (input.equalsIgnoreCase("x")) {
                break;  // Exit loop when user enters 'x'
            }

            try {
                int num = Integer.parseInt(input);  // Convert to integer
                sum += num;  // Add to sum
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number or 'x' to stop.");
            }
        }

        System.out.println("The sum of all entered numbers is: " + sum);
        sc.close();
    }
}
