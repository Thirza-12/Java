package Threads;
class A extends Thread{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Hiii");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }  // wait for 100 milliseconds
        }
    }
}
class B extends Thread{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Helloo");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }  // wait for 100 milliseconds
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        A obj1=new A(); // Threads
        B obj2=new B(); // Threads
        obj1.start();
        obj2.start();
        System.out.println(obj1.getPriority());
        obj1.setPriority(10);
    }
}
