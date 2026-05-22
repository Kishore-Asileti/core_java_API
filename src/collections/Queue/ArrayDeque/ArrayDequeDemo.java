package collections.Queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<>();

        q.offer("A");
        q.offer("B");

        System.out.println(q.poll());
    }

}
