import java.util.Random;

public class randompostivenegative
{
    public static void main(String[] args) {
        Random rand = new Random();
        int num =  rand.nextInt(10)+1;
        System.out.println("the number is "+num);
        System.out.println((num >= 0) ? "The number is postive" : "The number is negative");


    }
}