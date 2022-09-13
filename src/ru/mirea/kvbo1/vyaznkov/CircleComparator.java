package ru.mirea.kvbo1.vyaznkov;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    public int compare(Circle a, Circle b) {
        if (a.getRadius() == b.getArea()) {
            return 0;
        }
        if (a.getRadius() > b.getRadius()) {
            return 1;
        } else {
            return -1;
        }
    }
}
