package com.training.lambdas;

import com.training.collection.sorting.comparable.Person;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@NoArgsConstructor
public class JavaUtilFunction {

    public List<Person> initData() {
        return new ArrayList<>(List.of(new Person("Marco", 34),
                new Person("Ana", 28),
                new Person("Bea", 41)));
    }
    public void predicateBehaviour() {
        List<Person> people = initData();
        people.removeIf(person -> person.getAge().equals(28));
        printPeople(people);
    }

    public void functionBehaviour() {
        List<Person> people = initData();
        people.stream().map(Person::getAge);
        printPeople(people);
    }

    public void unaryBehaviour() {
        List<Person> people = initData();
        people.replaceAll(person -> new Person("Paco", 30));
        printPeople(people);
    }

    public void consumerBehaviour() {
        List<Person> people = initData();
        people.forEach(System.out::println);
    }

    public Stream supplierBehaviour() {
        return Stream.generate(() -> Math.random() * 500 + 1);
    }

    public void allBehaviourInOneOrderedEvenNumbers() {
        List<Integer> numbers = List.of(10, 4, 21, 3, 17, 8, 20, 11);
        List<Integer> orderedNumbers = new ArrayList<>(numbers);
        orderedNumbers.removeIf(n -> n % 2 == 1);
        orderedNumbers.sort((a, b) -> b - a);
        // orderedNumbers.sort(Comparator.reverseOrder());
        orderedNumbers.forEach(System.out::println);
    }

    private void printPeople(final List<Person> people) {
        for (Person p: people) {
            System.out.println(p.toString());
        }
    }
}
