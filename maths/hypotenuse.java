import java.util.Scanner;
public class hypotenuse
{    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int base = sc.nextInt();
        System.out.println("Enter the height : ");
        int height = sc.nextInt();

        double hyp = Math.sqrt((base*base)+(height*height));

        System.out.println("the length of hypotenuse is :"+hyp);



        
    }
}