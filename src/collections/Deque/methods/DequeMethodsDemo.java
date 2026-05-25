package collections.Deque.methods;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMethodsDemo {
    public static void main(String[] args) {

        Deque<String> dq = new ArrayDeque<>();

        dq.addFirst("B");
        dq.addLast("C");
        dq.addFirst("A");

        System.out.println(dq);

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println(dq.pollFirst());

        System.out.println(dq);

        System.out.println(dq.size());

        dq.clear();

        System.out.println(dq.isEmpty());
    }

}
