package com.havensclass.linkedlist;

public class LinkedList {
    private Node curr, head;

    public LinkedList(Node head){
        this.head = head;
        curr = head;
    }

    public void append(Node n) {
        while (curr.getNext()!=null) {
            curr = curr.getNext();
        }
        curr.setNext(n);
        curr = head;
    }

    public void prepend(Node n) {
        head = n;
        head.setNext(curr);
        curr = head;
    }

    public void insertAfter(int position, Node node) {
        for(int i = 0; i < position; ++i) {
            curr = curr.getNext();
        }
        node.setNext(curr.getNext());
        curr.setNext(node);
        curr = head;
    }

    public void remove(Node node) {
        while(curr.getNext().getData() != node.getData()){
            curr = curr.getNext();
        }
        curr.setNext(curr.getNext().getNext());
        curr = head;
    }

    public void print() {
        curr = head;
        while (curr.getNext() != null) {
            System.out.print(curr.getData() + ", ");
            curr = curr.getNext();
        }
        System.out.println(curr.getData());
        curr = head;
    }

    public int getLength() {
        int i = 0;
        while (curr.getNext() != null) {
            i++;
            curr = curr.getNext();
        }
        curr = head;
        return i+1;
    }
}
