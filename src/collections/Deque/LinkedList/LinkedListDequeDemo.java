package collections.Deque.LinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeDemo {
    public static void main(String[] args) {
        Deque<String> dq = new LinkedList<>();

        dq.addFirst("A");
        dq.addLast("B");

        System.out.println(dq);

        dq.removeLast();

        System.out.println(dq);
    }

}
