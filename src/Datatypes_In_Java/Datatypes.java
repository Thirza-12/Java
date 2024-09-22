package Datatypes_In_Java;

public class Datatypes {
    public static void main(String[] args) {

        // Primitive Datatypes
        int num1=9;
        float marks = 70.5f;
        double d=80.90;
        char c='K';
        byte b=127;
        short sh=558;
        long l=57564766554434345L;
        boolean bool=true; // you can't write 1 or 0 here as it will cause error that int cant be converted to boolean

        int zeroes= 10_0787_000; // You can put underscores also to make your code easy looking
        System.out.println(zeroes);

        double ex=12e5; // this means 12*10^5
        System.out.println(ex);

        char ch='a';
        ch++; // can be done
        // ch=ch+1 can not be done as it will say lossy conversion from int to char
        System.out.println(ch); // this will print b;
        // Numbers in binary and hexadecimal format
        int binary=0b101; // put 0b in first-place to write binary numbers
        System.out.println(binary);

        int hex=0x7E; // put 0x in first-place to write hexadecimal numbers
        System.out.println(hex);


    }
}
