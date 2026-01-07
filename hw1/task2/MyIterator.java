package hw1.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyIterator {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ListIterator<Integer> iter = list.listIterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println(list);
        while (iter.hasPrevious()) {
            int value = iter.previous();
            if (value % 2 == 0) {
                iter.remove();
            }
        }
        System.out.println(list);
    }
}
