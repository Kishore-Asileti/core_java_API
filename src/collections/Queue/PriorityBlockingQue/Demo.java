package collections.Queue.PriorityBlockingQue;

import java.util.concurrent.PriorityBlockingQueue;

public class Demo {
    public static void main(String[] args) throws Exception {

        PriorityBlockingQueue<Integer> q = new PriorityBlockingQueue<>();

        q.put(30);
        q.put(10);

        System.out.println(q.take());
    }

}
