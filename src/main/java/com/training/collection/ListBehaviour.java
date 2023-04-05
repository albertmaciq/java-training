package com.training.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListBehaviour {

    public void listBehaviour() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("world");
        list.add(1, "java");

        list.set(3, "!");
        list.get(0);
        list.remove(2);
        list.size();

        // fixed size list
        List<Integer> integersFix = Arrays.asList(1, 190);

        // immutable list
        List<Integer> integersInm = List.of(1, 190);

        // mutable list
        List<Integer> integersMut = new ArrayList<>(List.of(16, 190));
    }

    public List<String> replyList(final List<String> list) {
        // immutable list
        return List.copyOf(list);
    }
}
