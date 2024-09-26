package Collections_in_java;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Maps_in_java {
    public static void main(String[] args) {
//        Map<Integer,String>mp=new HashMap<>();
//        mp.put(50,"Thirza");
//        mp.put(90,"Vansh");
//        mp.put(89,"Umang");
//        mp.put(78,"Sunaina");
//        System.out.println(mp);
//        System.out.println(mp.get(90));

        Map<Integer,String>mp=new TreeMap<>();
        mp.put(50,"Thirza");
        mp.put(90,"Vansh");
        mp.put(89,"Umang");
        mp.put(78,"Sunaina");
        System.out.println(mp);
        System.out.println(mp.get(90));

        System.out.println(mp.keySet());
        System.out.println(mp.values());
    }
}
