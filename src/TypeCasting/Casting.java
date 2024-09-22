package TypeCasting;

public class Casting {
    public static void main(String[] args) {
        byte b=127;
        int a=b; // big value can contain short values, so this is applicable
        System.out.println(a);
    }

}
