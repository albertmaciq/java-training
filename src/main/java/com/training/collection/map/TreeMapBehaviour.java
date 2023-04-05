package com.training.collection.map;

import java.util.TreeMap;

public class TreeMapBehaviour {

    public void treeMapBehaviour() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(200, "data2");
        treeMap.put(400, "data4");
    }

    private void printValues(final TreeMap<Integer, String> treeMapBehaviour) {
        for (String val: treeMapBehaviour.values()) {
            System.out.println(val);
        }
    }
}
