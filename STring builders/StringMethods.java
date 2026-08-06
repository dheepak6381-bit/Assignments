public class StringMethods {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";
        String s3 = "hello";
        String s4 = "  Java Programming  ";

        // 1. charAt()
        System.out.println("charAt(): " + s1.charAt(1));

        // 2. codePointAt()
        System.out.println("codePointAt(): " + s1.codePointAt(1));

        // 3. codePointBefore()
        System.out.println("codePointBefore(): " + s1.codePointBefore(2));

        // 4. codePointCount()
        System.out.println("codePointCount(): " + s1.codePointCount(0, s1.length()));

        // 5. compareTo()
        System.out.println("compareTo(): " + s1.compareTo(s2));

        // 6. compareToIgnoreCase()
        System.out.println("compareToIgnoreCase(): " + s1.compareToIgnoreCase(s3));

        // 7. concat()
        System.out.println("concat(): " + s1.concat(" ").concat(s2));

        // 8. contains()
        System.out.println("contains(): " + s1.contains("ell"));

        // 9. contentEquals()
        System.out.println("contentEquals(): " + s1.contentEquals("Hello"));

        // 10. copyValueOf()
        char[] ch = {'J','A','V','A'};
        System.out.println("copyValueOf(): " + String.copyValueOf(ch));

        // 11. endsWith()
        System.out.println("endsWith(): " + s1.endsWith("lo"));

        // 12. equals()
        System.out.println("equals(): " + s1.equals("Hello"));

        // 13. equalsIgnoreCase()
        System.out.println("equalsIgnoreCase(): " + s1.equalsIgnoreCase(s3));

        // 14. format()
        String str = String.format("Name: %s Age: %d", "Arthika", 21);
        System.out.println("format(): " + str);

        // 15. getBytes()
        byte[] b = s1.getBytes();
        System.out.print("getBytes(): ");
        for(byte x : b)
            System.out.print(x + " ");
        System.out.println();

        // 16. getChars()
        char[] arr = new char[5];
        s1.getChars(0, 5, arr, 0);
        System.out.print("getChars(): ");
        for(char c : arr)
            System.out.print(c + " ");
        System.out.println();

        // 17. hashCode()
        System.out.println("hashCode(): " + s1.hashCode());

        // 18. indexOf()
        System.out.println("indexOf(): " + s1.indexOf('l'));

        // 19. isEmpty()
        System.out.println("isEmpty(): " + "".isEmpty());

        // 20. join()
        System.out.println("join(): " + String.join("-", "Java", "Python", "C"));

        // 21. lastIndexOf()
        System.out.println("lastIndexOf(): " + s1.lastIndexOf('l'));

        // 22. length()
        System.out.println("length(): " + s1.length());

        // 23. matches()
        System.out.println("matches(): " + s1.matches("[A-Za-z]+"));

        // 24. replace()
        System.out.println("replace(): " + s1.replace('l', 'x'));

        // 25. replaceAll()
        System.out.println("replaceAll(): " + s4.replaceAll("a", "@"));

        // 26. replaceFirst()
        System.out.println("replaceFirst(): " + s4.replaceFirst("a", "@"));

        // 27. split()
        String[] words = s4.trim().split(" ");
        System.out.print("split(): ");
        for(String w : words)
            System.out.print(w + " ");
        System.out.println();

        // 28. startsWith()
        System.out.println("startsWith(): " + s1.startsWith("He"));

        // 29. subSequence()
        System.out.println("subSequence(): " + s1.subSequence(1,4));

        // 30. substring()
        System.out.println("substring(): " + s1.substring(1,4));

        // 31. toCharArray()
        char[] chars = s1.toCharArray();
        System.out.print("toCharArray(): ");
        for(char c : chars)
            System.out.print(c + " ");
        System.out.println();

        // 32. toLowerCase()
        System.out.println("toLowerCase(): " + s1.toLowerCase());

        // 33. toUpperCase()
        System.out.println("toUpperCase(): " + s1.toUpperCase());

        // 34. toString()
        System.out.println("toString(): " + s1.toString());

        // 35. trim()
        System.out.println("trim(): '" + s4.trim() + "'");

        // 36. valueOf(int)
        System.out.println("valueOf(int): " + String.valueOf(100));

        // 37. valueOf(double)
        System.out.println("valueOf(double): " + String.valueOf(10.5));

        // 38. valueOf(boolean)
        System.out.println("valueOf(boolean): " + String.valueOf(true));

        // 39. valueOf(char[])
        System.out.println("valueOf(char[]): " + String.valueOf(ch));
    }
}