package Interface;
@FunctionalInterface
interface One{
    void show();
//    void hii(); // using functional interface you can't create more than one function
}
class Two implements One{
    public void show()
    {
        System.out.println("In show");
    }

}
public class Functional_Interface {
    public static void main(String[] args) {
        //    One obj=new One(); // Can not do because it is an interface
        One obj=new Two();
        obj.show();
    }


}
