package collections.Stack.ArrayDeque;

import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        stack.push("A");
        stack.push("B");

        System.out.println(stack.pop());
    }

}
