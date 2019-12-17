package com.havensclass.linkedlist;

public class StackTest {

    public static void main(String [] args) {
        Stack stack = new Stack(new Node(0));

        stack.push(new Node(1));
        stack.push(new Node(2));
        stack.push(new Node(3));

        stack.peek();

        stack.pop();

        stack.print();
    }

}
