package Threads;
class C implements java.lang.Runnable {
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Hiii");
            try {
                Thread.sleep(10); // wait for 10 milliseconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class D implements java.lang.Runnable {
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Helloo");
            try {
                Thread.sleep(10); // wait for 10 milliseconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Runnable_thread {
    public static void main(String[] args) {
        C obj1=new C();
        D obj2=new D();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}




