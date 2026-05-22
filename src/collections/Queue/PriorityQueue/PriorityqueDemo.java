package collections.Queue.PriorityQueue;
import java.util.*;
public class PriorityqueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();

        q.add(30);
        q.add(10);
        q.add(20);

        System.out.println(q.poll());
    }

}
