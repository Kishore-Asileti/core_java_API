package collections.Map.TreeMap;
import java.util.*;
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();

        map.put(30,"C");
        map.put(10,"A");
        map.put(20,"B");

        System.out.println(map);
    }

}
