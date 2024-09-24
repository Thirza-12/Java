package Classes_Intro;
class Calculate {
    int num1;
    int num2;

    public int add(int n1,int n2)
    {
        this.num1=n1;
        this.num2=n2;

        return num1+num2;
    }
}
public class Classes {
    public static void main(String[] args) {

        Calculate calc=new Calculate();
        int result=calc.add(3,4);
        System.out.println(result);
    }
}
