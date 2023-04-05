package com.training.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeBehaviour {

    public void dequeBehaviour() {
        Deque<String> queue = new ArrayDeque<>();
        // queue behaviour
        queue.add("Raphael");
        queue.add("Charles");

        Deque<String> stack = new ArrayDeque<>();
        // stack behaviour
        stack.push("Sophie");
        stack.push("Francis");

        // get and remove header element
        queue.poll(); // Charles
        stack.poll(); // Sophie
        queue.remove();
        stack.remove();

        // retrieve header element
        stack.peek();
        stack.element();

        stack.size();

        Deque<Integer> numDeque = new LinkedList<>();
    }

    public void print(final Deque<Integer> dequeBehaviour) {
        for (Integer val: dequeBehaviour) {
            System.out.println(val);
        }
    }

    public void logicalExample() {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(20);
        deque.push(10);
        deque.add(5);
        deque.remove();
        print(deque);
    }
}
