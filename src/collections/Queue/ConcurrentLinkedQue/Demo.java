package collections.Queue.ConcurrentLinkedQue;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Demo {
    public static void main(String[] args) {
        Queue<String> q = new ConcurrentLinkedQueue<>();

        q.add("Task1");
        q.add("Task2");

        System.out.println(q.poll());
    }

}
