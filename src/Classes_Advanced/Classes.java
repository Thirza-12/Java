package Classes_Advanced;
class A extends Object{
    public A()
    {
        super();
        System.out.println("In A"); // This will get executed as every constructor has a super method, whether you mention it or not.
    }
    public A(int n)
    {
        System.out.println("In A int");
    }
}
class B extends A{
    public B()
    {
        super();
        System.out.println("In B");
    }
    public B(int n)
    {
        this();
        System.out.println("In B int");
    }
}
public class Classes {
    public static void main(String[] args) {
        B obj=new B(6);// It will call A default Constructor and B parametrised one.
        // If you wanna call A parametrised you need to pass some value in super of B parametrised
    }
}
