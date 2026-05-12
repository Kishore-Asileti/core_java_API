package collections.LIst.ArrayList;
import java.util.*;

public class ListMethodsDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // ADD
        list.add("Apple"); // 0
        list.add("Banana"); //1
        list.add("Mango"); //2

        list.add(1, "Orange");

        System.out.println("After add: " + list);

        // GET
        System.out.println("Element at index 2: " + list.get(2));

        // SET (update)
        list.set(2, "Grapes");
        System.out.println("After set: " + list);

        // REMOVE
        list.remove("Banana");
        list.remove(0);
        System.out.println("After remove: " + list);

        // SEARCH
        System.out.println("Contains Mango? " + list.contains("Mango"));
        System.out.println("Index of Grapes: " + list.indexOf("Grapes"));

        // SIZE
        System.out.println("Size: " + list.size());

        // ITERATION
        System.out.print("Using loop: ");
        for(String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        // CONVERT
        Object[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // CLEAR
        list.clear();
        System.out.println("Is empty? " + list.isEmpty());
    }

}
