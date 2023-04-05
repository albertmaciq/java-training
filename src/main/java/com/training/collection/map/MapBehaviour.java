package com.training.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapBehaviour {

    public void mapBehaviour() {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "data1");
        map.put(200, "data2");
        map.put(300, "data3");
        map.put(100, "newData1");

        // add an entry if key do not exist or value equal to null
        map.putIfAbsent(400, "newData");

        map.get(100);

        map.size();
        map.remove(200);
        map.containsKey(300);
        map.containsValue("data3");


        // immutable map
        Map<Integer, String> mapFact = Map.ofEntries(
                Map.entry(123, "Carl"),
                Map.entry(328, "Klaus"),
                Map.entry(500, "Helena"));
    }

    public Map<Integer, String> replyMap(final Map<Integer, String> map) {
        // immutable map
        return Map.copyOf(map);
    }

    public void mapNullElementAllowed() {
        Map<Integer, String> example = new HashMap<>();
        example.put(2, "hello");
        example.put(null, "world");
        System.out.println(example.get(null));
    }
}
