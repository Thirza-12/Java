package Collections_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
//        List<Integer> nums=new ArrayList<>();
//        nums.add(97);
//        nums.add(79);
//        nums.add(4);
//        nums.add(8);
//        nums.add(9);
//        nums.add(17);
//        Collections.sort(nums);
//        System.out.println(nums);
//
//        // Sorting based on last digit of a number
//        Comparator<Integer> com=new Comparator<Integer>() {
//            public int compare(Integer o1, Integer o2) {
//                if(o1%10>o2%10)
//                    return 1;
//                else
//                    return -1;
//            }
//        };
//        Collections.sort(nums,com);
//        System.out.println(nums);

        List<String> nums=new ArrayList<>();
        nums.add("Thirza");
        nums.add("Vansh");
        nums.add("Ritika");
        nums.add("Umang");
        Collections.sort(nums);
        System.out.println(nums);

        // Sorting based on last digit of a number
        Comparator<String> com=new Comparator<String>() {
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length())
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(nums,com);
        System.out.println(nums);

    }
}
