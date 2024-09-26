package Interface;
interface A{
    int age=12; // final and static so we need to initialise them
    String area="Mumbai";
    void show();
}
interface X{
    void run();
}
class B implements A,X{
    public void show()
    {
        System.out.println("In show");
    }
    public void run()
    {
        System.out.println("Run");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        System.out.println(A.area); // I can directly call those variables as they are static and i can call them in my static main method
//        A.area="Hyderabad"   Can not do it because interface variables are final, you can not change it
        A ob=new B();// can not create A ob=new A(); as A is an interface
        ob.show();
//        ob.run();
    }
}
