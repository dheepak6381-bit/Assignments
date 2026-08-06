public class ContentEqualsExample {
    public static void main(String[] args) {
        String s = "Hello";
        boolean equals = s.contentEquals(new StringBuilder("Hello"));
        System.out.println("contentEquals result: " + equals);
    }
