package com.training.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetBehaviour {

    public void setBehaviour() {
        Set<String> set = new HashSet<>();
        set.add("Annie");
        set.add("Jonathan");

        // duplicate field not allowed in set
        set.add("Annie");

        set.remove("Annie");
        set.size();
        set.contains("Jonathan");

        // immutable set
        Set<String> setFact = Set.of("Marco", "Victor", "Izzy");
    }

    public Set<String> replySet(final Set<String> set) {
        // immutable set
        return Set.copyOf(set);
    }

    public void print(final Set<String> set) {
        for (String s: set) {
            System.out.println(s);
        }
    }
}
