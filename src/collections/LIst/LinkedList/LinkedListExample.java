package collections.LIst.LinkedList;
import java.util.*;


public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("List: " + list);

        list.addFirst("Orange");
        list.addLast("Grapes");

        System.out.println("After adding first & last: " + list);

        list.remove("Banana");

        System.out.println("After removal: " + list);
    }

}
