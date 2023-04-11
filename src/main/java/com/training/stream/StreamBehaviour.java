package com.training.stream;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@NoArgsConstructor
public class StreamBehaviour {

    public void streamStatement() {
        // collection
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(100);
        numbers.add(8);
        Stream<Integer> stCollection = numbers.stream();

        // array
        String[] strings = {"a", "xy", "jb", "mv"};
        Stream<String> stArray = Arrays.stream(strings);

        // series
        Stream<Double> st = Stream.of(2.4, 7.4, 9.1);

        // data range
        IntStream stint = IntStream.range(1, 10);
        IntStream stint2 = IntStream.rangeClosed(1, 10);
    }

    public  void countBehaviour() {
        Stream<Integer> st = Stream.of(2, 5, 7, 3, 6, 2, 3);
        System.out.println(st.count());
    }

    public void forEachBehaviour() {
        Stream<Integer> st = Stream.of(2, 5, 8, 3, 6, 2, 10);
        st.forEach(System.out::println);
    }

    public void distinctBehaviour() {
        Stream<Integer> st = Stream.of(2, 5, 3, 3, 6, 2, 4);
        System.out.println(st.distinct());
    }

    public void limitBehaviour() {
        Stream<Integer> st = Stream.of(2, 5, 8, 3, 6, 2, 10);
        Stream<Integer> stLimit = st.limit(3);
        stLimit.forEach(System.out::println);
    }

    public void skipBehaviour() {
        Stream<Integer> st = Stream.of(3, 7, 10, 93, 1);
        Stream<Integer> stSkip = st.skip(2);
        stSkip.forEach(System.out::println);
    }

    public void anyMatchBehaviour() {
        Stream<Integer> st = Stream.of(2, 5, 7, 3, 6, 2, 3, 9);
        System.out.println("Any greater than 5? " + st.anyMatch(n -> n > 5));
    }

    public void allMatchBehaviour() {
        Stream<Integer> st = Stream.of(2, 4, 10, 12, 6, 20, 8);
        System.out.println("All are even numbers? " + st.allMatch(n -> n % 2 == 0));
    }

    public void noneMatchBehaviour() {
        Stream<Integer> st = Stream.of(2, 4, 10, 12, 6, 20, 8);
        System.out.println("None is an odd number? " + st.noneMatch(n -> n % 2 == 1));
    }
}
