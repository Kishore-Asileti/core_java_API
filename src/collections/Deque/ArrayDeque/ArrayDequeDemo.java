package collections.Deque.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();

        dq.addFirst("B");  //[ B ]
        dq.addLast("C");  // [ B,C ]
        dq.addFirst("A"); // [A,B,C]

        System.out.println(dq);

        System.out.println("Removed: " + dq.removeFirst());

        System.out.println(dq);
    }

}
