public class ReplaceAllExample {
    public static void main(String[] args) {
        String s = "Hello World";
        String result = s.replaceAll("l+", "L");
        System.out.println("replaceAll result: " + result);
    }
}
