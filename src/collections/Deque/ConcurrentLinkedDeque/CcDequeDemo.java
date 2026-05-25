package collections.Deque.ConcurrentLinkedDeque;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class CcDequeDemo {
    public static void main(String[] args) {
        Deque<String> dq = new ConcurrentLinkedDeque<>();

        dq.addFirst("Task1");
        dq.addLast("Task2");

        System.out.println(dq.pollFirst());
    }

}
