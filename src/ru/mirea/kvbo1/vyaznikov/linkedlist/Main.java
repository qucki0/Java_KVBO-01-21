package ru.mirea.kvbo1.vyaznikov.linkedlist;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MyLinkedList mainList = createRandomList();
        System.out.println(mainList);
        mainList = MergeSort.sort(mainList);
        System.out.println(mainList);
    }

    public static MyLinkedList createRandomList() {
        Random random = new Random();
        int size = random.nextInt(1, 10);
        MyLinkedList mainList = new MyLinkedList(random.nextInt(1, 100));
        for (int i = 1; i < size; i++) {
            mainList.add(random.nextInt(1, 100));
        }
        return mainList;
    }

    public static MyLinkedList createCustomList() {
        MyLinkedList mainList = new MyLinkedList(15);
        mainList.add(35);
        mainList.add(26);
        mainList.add(74);
        mainList.add(21);
        mainList.add(21);
        mainList.add(27);
        return mainList;
    }
}