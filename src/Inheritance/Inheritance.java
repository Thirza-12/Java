package Inheritance;
class Calc{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
}
class AdvCalc extends Calc{ // Single level inheritance
    public int mul(int n1,int n2)
    {
        return n1*n2;
    }
    public int div(int n1,int n2)
    {
        return n1/n2;
    }
}
class VeryAdvCalc extends AdvCalc{ // multilevel inheritance
    public int power(int n1,int n2)
    {
        return (int)Math.pow(n1,n2);
    }
    public int add(int n1,int n2){ // Method overriding
        return n1+n2+1;
    }

}
// java does not support multiple inheritance
public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj=new VeryAdvCalc();
        System.out.println(obj.add(7,8)+ " " + obj.div(8,10)+" "+obj.mul(9,10)+ " " +obj.power(2,2));
    }
}
