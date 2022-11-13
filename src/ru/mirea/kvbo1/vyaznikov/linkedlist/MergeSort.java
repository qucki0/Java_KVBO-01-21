package ru.mirea.kvbo1.vyaznikov.linkedlist;

public class MergeSort {
    public static MyLinkedList merge(MyLinkedList firstList, MyLinkedList secondList) {
        MyLinkedList result;
        if (firstList.get(1).getData() < secondList.get(1).getData()) {
            result = new MyLinkedList(firstList.get(1).getData());
            firstList = firstList.cutRight(1);
        } else {
            result = new MyLinkedList(secondList.get(1).getData());
            secondList = secondList.cutRight(1);
        }


        while (firstList.size() != 0 && secondList.size() != 0) {
            if (firstList.get(1).getData() < secondList.get(1).getData()) {
                result.add(firstList.get(1));
                firstList = firstList.cutRight(1);
            } else {
                result.add(secondList.get(1));
                secondList = secondList.cutRight(1);
            }
        }
        if (firstList.size() != 0) {
            result.add(firstList);
        }
        if (secondList.size() != 0) {
            result.add(secondList);
        }
        return result;
    }

    public static MyLinkedList sort(MyLinkedList list) {
        if (list.size() == 1) {
            return list;
        }
        int centerIndex = list.size() / 2;
        MyLinkedList secondList = list.cutRight(centerIndex);
        MyLinkedList firstList = list.cutLeft(centerIndex);

        firstList = sort(firstList);
        secondList = sort(secondList);
        return merge(firstList, secondList);
    }
}
