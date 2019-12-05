package com.havensclass.linkedlist;

public class LinkedListTest {

    public static void main(String[]args) {
        Node node = new Node(0);
        LinkedList list = new LinkedList(node);

        list.append(new Node(1));
        list.append(new Node(2));
        list.prepend(new Node(3));
        list.insertAfter(1, new Node(4));
        list.print();
        System.out.println("List length is " + list.getLength());

        System.out.println();
        list.remove(node);
        list.print();
        System.out.println("List length is " + list.getLength());
    }

}
