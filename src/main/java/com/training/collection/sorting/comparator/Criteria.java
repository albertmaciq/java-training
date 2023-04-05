package com.training.collection.sorting.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Criteria implements Comparator<String> {

    public void criteriaBehaviour() {
        List<String> texts = new ArrayList<>();
        texts.add("my text");
        texts.add("hello");
        texts.add("the longest text");

        texts.sort(new Criteria());
    }

    @Override
    public int compare(final String ob1, final String ob2) {
        return ob1.length() - ob2.length();
    }


}
