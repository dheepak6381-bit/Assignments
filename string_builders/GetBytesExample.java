public class GetBytesExample {
    public static void main(String[] args) {
        String s = "Hello";
        byte[] bytes = s.getBytes();
        System.out.print("getBytes result: ");
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}
