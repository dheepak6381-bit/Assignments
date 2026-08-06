public class CopyValueOfExample {
    public static void main(String[] args) {
        char[] chars = {'J', 'a', 'v', 'a'};
        String result = String.copyValueOf(chars);
        System.out.println("copyValueOf result: " + result);
    }
