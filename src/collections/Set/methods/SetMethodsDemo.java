package collections.Set.methods;
import java.util.*;

public class SetMethodsDemo {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Mango");

        System.out.println("After add: " + set);

        System.out.println("Contains Apple: " + set.contains("Apple"));

        System.out.println("Size: " + set.size());

        set.remove("Banana");
        System.out.println("After remove: " + set);

        Set<String> other = new HashSet<>();
        other.add("apple");

        set.retainAll(other);
        System.out.println("After retainAll: " + set);

        set.clear();
        System.out.println("Is empty: " + set.isEmpty());
    }

}
