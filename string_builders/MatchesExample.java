public class MatchesExample {
    public static void main(String[] args) {
        String s = "12345";
        boolean matches = s.matches("\\d+");
        System.out.println("matches result: " + matches);
    }
}
