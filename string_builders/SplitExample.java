public class SplitExample {
    public static void main(String[] args) {
        String s = "Hello World Java";
        String[] parts = s.split(" ");
        System.out.println("split result:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
