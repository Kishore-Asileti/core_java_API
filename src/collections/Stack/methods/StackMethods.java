package collections.Stack.methods;

import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("Apple");
        s.push("Banana");
        s.push("Mango");

        System.out.println(s);

        System.out.println(s.peek());

        System.out.println(s.search("Apple"));

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.size());

        s.clear();

        System.out.println(s.empty());
    }

}
