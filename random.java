import java.util.Random;
public class random{
    public static void main(String[]args){
        Random rand = new Random();
        int x = rand.nextInt(6) + 1; // Generates a random number between 1 and 6
        System.out.println((x > 0 || x == 0) ? "The number is positive." + x : "The number is negative." + x);
    }
}