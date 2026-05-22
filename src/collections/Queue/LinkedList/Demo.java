package collections.Queue.LinkedList;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.add("A");
        q.add("B");
        q.add("C");

        System.out.println(q);

        System.out.println(q.poll());

        System.out.println(q);
    }

}
