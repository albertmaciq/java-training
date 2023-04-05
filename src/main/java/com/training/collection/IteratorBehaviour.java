package com.training.collection;

import java.util.Iterator;
import java.util.List;

public class IteratorBehaviour {

    public void readIterable() {
        List<Integer> list = List.of(1, 2, 3);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
