public class EqualsIgnoreCaseExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        boolean result = s1.equalsIgnoreCase(s2);
        System.out.println("equalsIgnoreCase result: " + result);
    }
}
