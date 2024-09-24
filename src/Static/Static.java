package Static;
class Mobile{
    String brand;
    int price;
    static String name="heyyyyyyyy";// static
    static {
        name="Mera Phone";
        System.out.println("In static");
    }
    Mobile()
    {
        brand="";
        price=0;
        name="";
        System.out.println("In constructor");
    }

    public static void show() {
        System.out.println(name); // this can be done as name is static
    }
}
public class Static {
    public static void main(String[] args) throws ClassNotFoundException {
//        Mobile obj1=new Mobile();
//        obj1.brand="Apple";
//        obj1.name="Hello";
//        obj1.price=150000;
//        System.out.println(obj1.name+" "+obj1.price+" "+obj1.brand);
//        Mobile obj2=new Mobile();
//        obj2.brand="Samsung";
//        obj2.name="My Phone";
//        obj2.price=150900;
//        System.out.println(obj2.name+" "+obj2.price+" "+obj2.brand);
//        System.out.println(Mobile.name); // It will print my phone because obj2 changed it.


//        Class.forName("Static.Mobile")


    }
}
