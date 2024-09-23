package Strings;

public class Strings {
    public static void main(String[] args) {

//        String s= "Thirza"; // String is created in string constant pool
//        String t="Thirza"; // String is created in string constant pool
//        System.out.println(s==t); // Both the objects are referring to same object so this will result in true
//        System.out.println(s.equals(t)); // This will give true as it checks if value is same or not
//
//        String n=new String("Thirza"); // String created in non-constant pool memory
//        String m=new String("Thirza"); // String created in non-constant pool memory
//        // Now they are two different objects
//        System.out.println(m==n); // so this will be false
//        System.out.println(m.equals(n)); // This will only compare values not reference

        // StringBuilder methods

        // 1. Append
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(" World");
//        System.out.println(sb);  // Output: Hello World

        // 2. Insert
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.insert(5, " World");
//        System.out.println(sb);  // Output: Hello World

        // 3. Delete
//        StringBuilder sb = new StringBuilder("Hello World");
//        sb.delete(5, 11);
//        System.out.println(sb);  // Output: Hello

        // 4. deleteCharAt
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.deleteCharAt(4);
//        System.out.println(sb);  // Output: Hell

        // 5. (i) replace in StringBuilder
        StringBuilder sb = new StringBuilder("Hello World");
        sb.replace(6, 11, "Java");
        System.out.println(sb);  // Output: Hello Java

        // 5. (ii) replace in string

        String str = "hello world";
        String newStr = str.replace('l', 'x');
        System.out.println(newStr);  // Output: hexxo worxd

        // 6. reverse
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.reverse();
//        System.out.println(sb);  // Output: olleH

        // 7. substring
//        StringBuilder sb = new StringBuilder("Hello World");
//        String sub = sb.substring(6, 11);
//        System.out.println(sub);  // Output: World

        // 8. length
//        StringBuilder sb = new StringBuilder("Hello");
//        int len = sb.length();
//        System.out.println(len);  // Output: 5

        // 9. capacity
//        StringBuilder sb = new StringBuilder("Hello");
//        System.out.println(sb.capacity());  // Output: Depends on implementation (default is often 16 + length)

        // 10. setLength
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.setLength(3);
//        System.out.println(sb);  // Output: Hel

        // 11. charAt()
//        StringBuilder sb = new StringBuilder("Hello");
//        char ch = sb.charAt(1);
//        System.out.println(ch);  // Output: e

        // 12. setCharAt()
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.setCharAt(1, 'a');
//        System.out.println(sb);  // Output: Hallo

        // 13. toString()
//        StringBuilder sb = new StringBuilder("Hello");
//        String str = sb.toString();
//        System.out.println(str);  // Output: Hello



    }
}
