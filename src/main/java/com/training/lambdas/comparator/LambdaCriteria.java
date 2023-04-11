package com.training.lambdas.comparator;

import com.training.collection.sorting.comparable.Person;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class LambdaCriteria {

    public void comparatorWithLambdaCriteriaBehaviour() {
        List<String> texts = new ArrayList<>();
        texts.add("my text");
        texts.add("the longest text");
        texts.add("hello");
        texts.sort((a, b) -> a.length() - b.length());

        print(texts);
    }

    public void sortWithLambdaByAge() {
        List<Person> people = new ArrayList<>(List.of(new Person("Marco", 34),
                                                      new Person("Ana", 28),
                                                      new Person("Bea", 41)));

        people.sort((a, b) ->  a.getAge() - b.getAge());
        printPeople(people);
    }

    private void print(final List<String> list) {
        for (String s: list) {
            System.out.println(s);
        }
    }

    private void printPeople(final List<Person> people) {
        for (Person p: people) {
            System.out.println(p.toString());
        }
    }
}
