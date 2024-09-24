package Abstract;
abstract class Car{
    public abstract void drive();// they don't have body...abstract methods

}
class WagonR extends Car{
    public void drive()
    {
        System.out.println("Driving");
    }
}
public class Abstract {
    public static void main(String[] args) {

    }
}
