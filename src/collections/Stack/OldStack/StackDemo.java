package collections.Stack.OldStack;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Stack: " + stack);

        System.out.println("Top: " + stack.peek());

        System.out.println("Removed: " + stack.pop());

        System.out.println("After pop: " + stack);
    }

}
