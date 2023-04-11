package com.training.collection.sorting;

import com.training.array.ArrayBehaviour;
import com.training.collection.sorting.comparable.Person;

import java.util.Arrays;

public class ArrayBehaviourSort extends ArrayBehaviour {

    public void arraySort() {
        int[] numbers = {7, 2, 34, 11, 6};
        Arrays.sort(numbers);
        print1DArrayValues(numbers);
    }

    public void arrayObjectSort() {
        Person[] people = {new Person("Ana", 25),
                            new Person("Marcos", 19),
                            new Person("Ana", 21)};
        Arrays.sort(people);
        printPeople(people);
    }

    private void printPeople(final Person[] people) {
        for (Person p: people) {
            System.out.println(p.toString());
        }
    }

    public void arrayBinarySearch() {
        int[] numbers = {3, 5, 7, 9, 15, 20};
        System.out.println(Arrays.binarySearch(numbers, 9));
        System.out.println(Arrays.binarySearch(numbers, 10));
    }

    public void compareExample() {
        int[] numbers1 = {1, 2, 5};
        int[] numbers2 = {1, 2, 1, 4};
        int[] numbers3 = {1, 2, 1, 4, 1};
        int[] numbers4 = {1, 2, 1, 4, 1};

        System.out.println(Arrays.compare(numbers1, numbers2)); // 1
        System.out.println(Arrays.compare(numbers2, numbers3)); // -1
        System.out.println(Arrays.compare(numbers3, numbers4)); // 0
    }

    public void mismatchExample() {
        int[] numbers1 = {1, 2, 5};
        int[] numbers2 = {1, 2, 1, 4};
        int[] numbers3 = {1, 2, 1, 4, 1};

        System.out.println(Arrays.mismatch(numbers1, numbers2)); // 2
        System.out.println(Arrays.mismatch(numbers2, numbers3)); // -1
    }
}
