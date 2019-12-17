package com.havensclass.linkedlist;

public class Stack {
    private Node top;
    private Node curr;

    public Stack(Node node) {
        this.top = node;
        this.curr = top;
    }

    public void push(Node node) {
        top.setNext(new Node(top.getData()));
        top = node;
    }

    public Node pop() {
        top = top.getNext();
        return top;
    }

    public Node peek() {
        return top;
    }

    public int getLength() {
        int length = 0;

        while (curr.getNext() != null) {
            length++;
            curr = curr.getNext();
        }
        curr = top;
        return length;
    }

    public boolean isEmpty() {
        boolean isEmpty = true;
        if(top.getNext() != null) {
            isEmpty =false;
        }
        return isEmpty;
    }

    public void print() {
        for(int i = 0; i < getLength(); i++){
            System.out.print(curr.getData());
            if (curr.getNext() != null) {
                curr = curr.getNext();
            }
        }
    }
}
