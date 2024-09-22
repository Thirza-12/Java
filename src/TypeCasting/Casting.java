package TypeCasting;

public class Casting {
    public static void main(String[] args) {

        // implicit conversion
        byte b=127;
        int a=b; // big value can contain short values, so this is applicable....this is called implicit conversion
        System.out.println(a);

        // explicit conversion
        int c=257;
        byte by=(byte)c; // (257%256)
        System.out.println(by);

        float f=5.6f;
        int t=(int)f; // explicit conversion
        System.out.println(t);

        // Type promotion

        byte one=10;
        byte two=30;
        int result=one*two; // type promotion
        System.out.println(result);
    }

}
