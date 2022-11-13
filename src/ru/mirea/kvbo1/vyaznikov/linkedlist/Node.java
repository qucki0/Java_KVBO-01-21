package ru.mirea.kvbo1.vyaznikov.linkedlist;

public class Node {
    int data;
    Node next;

    public Node(int dataValue) {
        next = null;
        data = dataValue;
    }

    public int getData() {
        return data;
    }

    public void setData(int dataValue) {
        data = dataValue;
    }


    public Node getNext() {
        return next;
    }

    public void setNext(Node nextNode) {
        next = nextNode;
    }

    @Override
    public String toString() {
        return "node=" + data;
    }
}

