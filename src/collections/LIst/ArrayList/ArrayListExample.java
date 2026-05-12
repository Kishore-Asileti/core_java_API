package collections.LIst.ArrayList;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple"); // 0
        list.add("Banana"); //1
        list.add("Mango"); //2

        System.out.println("List: " + list);

        System.out.println("Element at index 1: " + list.get(1));

        list.remove("Banana");

        System.out.println("After removal: " + list);
    }

}
