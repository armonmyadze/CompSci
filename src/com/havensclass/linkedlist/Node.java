package com.havensclass.linkedlist;

public class Node {
    public Node(){
        data = 0;
        next = null;
    }

    public Node(int data) {
        this.data = data;
        next = null;
    }

    private int data;
    private Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
