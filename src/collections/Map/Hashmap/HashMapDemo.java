package collections.Map.Hashmap;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Kishore");
        map.put(102, "Rahul");
        map.put(101, "Ravi");   // replaces old value

        System.out.println(map);
    }

}
