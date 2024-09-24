package Encapsuation;
class Human{
    private String name;
    private int age;
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.setAge(90);
        obj.setName("Thirza");
        System.out.println(obj.getName()+ " "+ obj.getAge());
    }

}
