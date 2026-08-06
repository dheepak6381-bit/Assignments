import java.util.Scanner;

public class datatypesscanner
{
        public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a byte value");
        byte a = sc.nextByte();

        System.out.println("Enter a short value");
        short b = sc.nextShort();

        System.out.println("Enter a integer value");
        int c = sc.nextInt();

        System.out.println("Enter a boolean value");
        boolean d = sc.nextBoolean();

        System.out.println("Enter a word value");
        String e = sc.next();

        System.out.println("Enter a sentence value");
        String f = sc.nextLine();

        System.out.println("Enter a string value");
        char g = sc.next().charAt(0);

        System.out.println("------Output-----");
        System.out.println("byte="+a);
        System.out.println("short="+b);
        System.out.println("int="+c);
        System.out.println("Boolean="+d);
        System.out.println("Sentence="+f);
        System.out.println("String(0)"+g);

    }
}