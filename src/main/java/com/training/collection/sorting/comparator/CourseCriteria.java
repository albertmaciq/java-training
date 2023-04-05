package com.training.collection.sorting.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CourseCriteria implements Comparator<Course> {

    public void criteriaExample() {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("ABC course", 30.00, 19.99));
        courses.add(new Course("ZZZ course", 25.00, 24.99));
        courses.add(new Course("My course", 60.00, 50.00));

        courses.sort(new CourseCriteria());
    }

    @Override
    public int compare(final Course c1, final Course c2) {
        return c1.getDuring().compareTo(c2.getDuring());
    }
}
