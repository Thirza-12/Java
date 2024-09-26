package Enums;

import java.util.Arrays;

enum Status{
    Running,Success,Pending,Failed
}
public class Enums {
    public static void main(String[] args) {
//        Status s= Status.Pending;
//        System.out.println(s + " "+ s.ordinal());
//        Status[] ss=Status.values();
//        System.out.println(Arrays.toString(ss));

        Status s=Status.Running;
        if(s==Status.Success)
            System.out.println("Done");
        else if(s==Status.Failed)
            System.out.println("Try again");
        else if(s==Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Status Running");
    }
}
