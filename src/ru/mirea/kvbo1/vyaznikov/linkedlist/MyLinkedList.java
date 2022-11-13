package ru.mirea.kvbo1.vyaznikov.linkedlist;

public class MyLinkedList {
    private final Node head;
    private int listCount;

    public MyLinkedList(int firstElement) {
        head = new Node(firstElement);
        listCount = 1;
    }

    public MyLinkedList(Node firstNode, int size) {
        head = firstNode;
        listCount = size;
        get(size).setNext(null);
    }

    public MyLinkedList cutRight(int startIndex) {
        int newSize = size() - startIndex;
        return new MyLinkedList(get(startIndex + 1), newSize);
    }

    public MyLinkedList cutLeft(int endIndex) {
        return new MyLinkedList(get(1), endIndex);
    }

    public void add(int data) {
        add(data, size());
    }

    public void add(MyLinkedList list) {
        get(listCount).setNext(list.get(1));
        listCount += list.size();
    }

    public void add(Node node) {
        get(listCount).setNext(node);
        listCount += 1;
    }

    public void add(int data, int index) {
        Node tmp = new Node(data);
        Node current = head;
        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        current.setNext(tmp);
        listCount++;
    }

    public Node get(int index) {
        Node current = head;
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null) break;
            current = current.getNext();
        }
        return current;
    }

    public void swap_values(int index1, int index2) {
        int tmp = get(index1).getData();
        get(index1).setData(get(index2).getData());
        get(index2).setData(tmp);
    }

    public boolean remove(int index) {
        if (index < 1 || index > size()) return false;
        Node tmp = get(index);
        get(index - 1).setNext(get(index + 1));
        tmp.setNext(null);
        return true;
    }

    public int size() {
        return listCount;
    }

    @Override
    public String toString() {
        Node current = head;
        StringBuilder output = new StringBuilder();
        while (current != null) {
            int data = current.getData();
            output.append("[").append(data).append("]");
            current = current.getNext();
        }
        return output.toString();
    }
}

