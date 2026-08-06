import java.util.*;

public class MatrixPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read matrix size
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Print matrix
        System.out.println("Matrix:");
        for (int[] row : mat) System.out.println(Arrays.toString(row));

        // Sum
        int sum = 0;
        for (int[] row : mat) for (int x : row) sum += x;
        System.out.println("Sum = " + sum);

        // Largest & Smallest
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int[] row : mat) for (int x : row) {
            max = Math.max(max, x);
            min = Math.min(min, x);
        }
        System.out.println("Largest = " + max + ", Smallest = " + min);

        // Row-wise sums
        for (int i = 0; i < rows; i++) {
            int rsum = 0;
            for (int j = 0; j < cols; j++) rsum += mat[i][j];
            System.out.println("Row " + i + " sum = " + rsum);
        }

        // Column-wise sums
        for (int j = 0; j < cols; j++) {
            int csum = 0;
            for (int i = 0; i < rows; i++) csum += mat[i][j];
            System.out.println("Col " + j + " sum = " + csum);
        }

        // Average
        int count = rows * cols;
        System.out.println("Average = " + (double) sum / count);

        // Count even & odd
        int even = 0, odd = 0;
        for (int[] row : mat) for (int x : row) if (x % 2 == 0) even++; else odd++;
        System.out.println("Even = " + even + ", Odd = " + odd);

        // Main diagonal (only if square)
        if (rows == cols) {
            System.out.print("Main diagonal: ");
            for (int i = 0; i < rows; i++) System.out.print(mat[i][i] + " ");
            System.out.println();

            System.out.print("Secondary diagonal: ");
            for (int i = 0; i < rows; i++) System.out.print(mat[i][rows - 1 - i] + " ");
            System.out.println();
        }
    }
}
