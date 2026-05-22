package collections.Map.Methods;
import java.util.*;

public class MapMethodsDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        // put
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Mango");

        System.out.println("After put: " + map);

        // get
        System.out.println("get(2): " + map.get(2));

        // getOrDefault
        System.out.println(map.getOrDefault(5,"Not Found"));

        // replace
        map.replace(2,"Orange");
        System.out.println("After replace: " + map);

        // contains
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Mango"));

        // remove
        map.remove(3);
        System.out.println("After remove: " + map);

        // keySet
        System.out.println("Keys: " + map.keySet());

        // values
        System.out.println("Values: " + map.values());

        // entrySet
        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getKey()+" -> "+e.getValue());
        }

        map.clear();
        System.out.println(map.isEmpty());
    }

}
