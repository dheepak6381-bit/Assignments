import java.util.Scanner;
public class hypotenouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter the second side of the triangle: ");
        double side2 = sc.nextDouble();
        double hypotenuse = Math.sqrt((side1*side1) + (side2*side2));
        System.out.println("The hypotenuse of the triangle is: " + hypotenuse);
    }
}