package collections.Set.Linkedset;
import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Pineapple");

        System.out.println(set);
    }

}
