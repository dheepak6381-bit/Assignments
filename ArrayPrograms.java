import java.util.*;

public class ArrayPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print all elements
        System.out.println("Elements: " + Arrays.toString(arr));

        // Sum
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum = " + sum);

        // Average
        System.out.println("Average = " + (double) sum / n);

        // Largest & Smallest
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Largest = " + max + ", Smallest = " + min);

        // Count even & odd
        int even = 0, odd = 0;
        for (int x : arr) if (x % 2 == 0) even++; else odd++;
        System.out.println("Even = " + even + ", Odd = " + odd);

        // Reverse
        System.out.print("Reversed: ");
        for (int i = n - 1; i >= 0; i--) System.out.print(arr[i] + " ");
        System.out.println();

        // Search element
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        boolean found = false;
        for (int x : arr) if (x == target) found = true;
        System.out.println("Found? " + found);

        // Occurrence count
        int count = 0;
        for (int x : arr) if (x == target) count++;
        System.out.println("Occurrences of " + target + " = " + count);

        // Second largest
        Arrays.sort(arr);
        System.out.println("Second Largest = " + arr[n - 2]);

        // Remove duplicates
        Set<Integer> set = new LinkedHashSet<>();
        for (int x : arr) set.add(x);
        System.out.println("Without duplicates: " + set);

        // Frequency of each element
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) freq.put(x, freq.getOrDefault(x, 0) + 1);
        System.out.println("Frequency: " + freq);
    }
}
