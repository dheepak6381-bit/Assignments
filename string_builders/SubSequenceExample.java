public class SubSequenceExample {
    public static void main(String[] args) {
        String s = "Hello World";
        CharSequence subseq = s.subSequence(0, 5);
        System.out.println("subSequence result: " + subseq);
    }
}
