package Exceptions;
class MyException extends Exception{
    MyException(String str)
    {
        super(str);
    }
}
public class Exceptions {
    public static void main(String[] args) {
        int i=17;
        int []nums=new int[5];
        String str=null;
        try{
//            int j=8/i;
//            System.out.println(nums[5]);
//            System.out.println(str.length());
            int j=18/90;
            if(j==0)
//                throw new ArithmeticException("Default...");
                throw new MyException("Ans was 0");
        }
        catch (MyException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide by zero"+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limits");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong..."+e);
        }

        System.out.println("Done");
    }
}
