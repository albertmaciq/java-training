package com.training.collection.set;

import java.util.TreeSet;

public class TreeSetBehaviour {

    public void treeSetBehaviour() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Berta");
        treeSet.add("Angel");
        treeSet.add("Tobias");
        treeSet.add("Colt");
    }

    private void printValues(final TreeSet<String> treeSet) {
        for (String val:treeSet) {
            System.out.println(val);
        }
    }
}
