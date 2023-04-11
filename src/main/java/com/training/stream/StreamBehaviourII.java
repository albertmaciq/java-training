package com.training.stream;

import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@NoArgsConstructor
public class StreamBehaviourII {

    public void filterBehaviour() {
        Stream<Integer> st = Stream.of(7, 5, 7, 3, 6, 2, 3, 8, 5);
        System.out.println(st.distinct().filter(s -> s > 3).count());
    }

    public void findFirstBehaviour() {
        Stream<Integer> st = Stream.of(11, 5, 8, 3, 9);
        Optional<Integer> optInteger = st.filter(n -> n % 2 == 0).findFirst();
        optInteger.ifPresent(integer -> System.out.println("The first even number is: " + integer));
    }

    public void findAnyBehaviour() {
        Stream<Integer> st = Stream.of(11, 5, 8, 4, 0);
        Optional<Integer> optInteger = st.filter(n -> n % 2 == 0).findAny();
        optInteger.ifPresent(n -> System.out.println("Return random even value: " + n));
    }

    public void maxBehaviour() {
        Stream<Integer> st = Stream.of(11, 5, 8, 4, 0);
        Optional<Integer> optInteger = st.max((a, b) -> a - b);
        System.out.println("Higher value: " + optInteger);
    }

    public void minBehaviour() {
        Stream<Integer> st = Stream.of(11, 5, 8, 4, 0);
        Optional<Integer> optInteger = st.min((a, b) -> a - b);
        System.out.println("Lower value: " + optInteger);
    }

    public void mapBehaviour() {
        Stream<String> st = Stream.of("Joan", "Donna", "Mikael");
        Stream<String> stMap = st.map(String::toUpperCase);
        stMap.forEach(System.out::println);
    }

    public void mapToIntBehaviour() {
        Stream<String> st = Stream.of("Joan", "Donna", "Mikael");
        // string sum()
        System.out.println(st.mapToInt(String::length).sum()); // 15
    }

    public void flatMapBehaviour() {
        List<List<String>> data = Arrays.asList(Arrays.asList("Gemma", "Maria", "Carlos"),
                                                Arrays.asList("Laura", "Ana", "Luis"));

        System.out.println(data.stream()
                .flatMap(l -> l.stream().map(String::length))
                .filter(n -> n > 4)
                .count());
    }

    public void exampleGetHigherValue() {
        Integer[][] data = {{8, 3, 5}, {2, 11, 7}, {4, 1, 9, 6}};
        System.out.println(Arrays.stream(data)
                .flatMap(Arrays::stream)
                .mapToInt(n -> n)
                .max().getAsInt());
    }
}
