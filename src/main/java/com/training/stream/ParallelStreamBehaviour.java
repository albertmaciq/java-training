package com.training.stream;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamBehaviour {

    public void parallelStreamStatement() {
        List<Integer> numbers = List.of(20, 100, 80, 25);
        Stream<Integer> parSt = numbers.parallelStream();

        Stream<Integer> numbSt = Stream.of(20, 100, 80, 25);
        Stream<Integer> parallelSt = numbSt.parallel();
    }

    public void parallelStreamBehaviour() {
        Stream<Integer> numbSt = Stream.of(20, 100, 80, 25);
        Stream<Integer> parallelSt = numbSt.parallel();

        System.out.println(parallelSt.filter(n -> n % 2 == 0).count());
    }

    public void parallelStreamWrongUseBehaviour() {
        List<Integer> numbers = List.of(20, 100, 80, 25);
        Stream<Integer> parSt = numbers.parallelStream();

        parSt.sorted().forEach(System.out::println);
    }

    public void parallelStreamToSequential() {
        List<Integer> numbers = List.of(20, 100, 80, 25);
        Stream<Integer> parSt = numbers.parallelStream();

        parSt.distinct().filter(n -> n % 2 == 0)
                .sorted().sequential()
                .forEach(System.out::println);
    }
}
