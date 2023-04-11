package com.training.stream;

import com.training.collection.sorting.comparable.Person;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamBehaviourIII {

    public void peekBehaviour() {
        Stream<Integer> st = Stream.of(20, 5, 8, 3, 9);
        System.out.println("Total: " + st.filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("Even: " + n))
                .count());
    }

    public void peekExample1() {
        Stream<Integer> numbers = Stream.of(20, 5, 8, 3, 9);
        numbers.peek(System.out::println);
    }

    public void peekExample2() {
        Stream<Integer> numbers = Stream.of(20, 5, 8, 3, 9);
        numbers.peek(System.out::println).allMatch(n -> n > 5);
    }

    public void sortedBehaviour() {
        Stream<String> st = Stream.of("car", "peek", "lake", "disorder");
        st.sorted((a, b) -> a.length() - b.length())
                .forEach(System.out::println);
    }

    public void sortedComparatorBehaviour() {
        Stream<Person> personSt = Stream.of(new Person("Marco", 34),
                new Person("Ana", 28));
        personSt.sorted(Comparator.comparing(Person::getAge))
                .forEach(p -> System.out.println(p.getName()));
    }

    public void reduceBehaviour() {
        Stream<Integer> numbers = Stream.of(20, 5, 8, 3, 9);
        System.out.println(numbers.reduce(Integer::sum).get());
    }

    public void threeFirstEvenLowerValues() {
        Stream<Integer> numbers = Stream.of(11, 20, 5, 8, 3, 9, 4, 10, 2);
        System.out.println("Sum of first 3 even lower values: " + numbers
                .filter(n -> n % 2 == 0)
                .sorted()
                .limit(3)
                .reduce(Integer::sum).get());
    }
}
