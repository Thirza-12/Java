package Collections_in_java;


import java.util.ArrayList;

import java.util.List;
public class List_in_java {
    public static void main(String[] args) {
        List<Integer> num =new ArrayList<Integer>();
        num.add(6);
        num.add(3);
        num.add(90);
        num.add(6);
        for(int n:num)
            System.out.println(n);
        System.out.println(num);
        System.out.println(num.get(1));
        System.out.println(num.indexOf(3));

    }


}
