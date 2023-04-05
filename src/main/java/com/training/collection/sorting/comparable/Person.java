package com.training.collection.sorting.comparable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Person implements Comparable<Person> {

    private String name;
    private Integer age;

    @Override
    public int compareTo(final Person p) {
        if (name.compareTo(p.getName()) == 0) {
            return age.compareTo(p.getAge());
        } else {
            return name.compareTo(p.getName());
        }
    }
}
