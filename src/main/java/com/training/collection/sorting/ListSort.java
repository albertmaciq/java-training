package com.training.collection.sorting;


import com.training.collection.ListBehaviour;
import com.training.collection.sorting.comparable.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort extends ListBehaviour {

    public void listSort() {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(23);
        numberList.add(8);
        numberList.add(13);

        Collections.sort(numberList);
        printList(numberList);
    }

    private void printList(final List<Integer> numberList) {
        for (Integer numb:numberList) {
            System.out.println(numb);
        }
    }

    public void arrayObjectSort() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ana", 25));
        personList.add(new Person("Marcos", 19));
        personList.add(new Person("Ana", 21));

        Collections.sort(personList);
        printPersonList(personList);
    }

    private void printPersonList(final List<Person> personList) {
        for (Person p: personList) {
            System.out.println(p.toString());
        }
    }


}
