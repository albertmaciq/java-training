package com.training.stream;

import com.training.collection.sorting.comparable.Person;
import com.training.stream.model.City;
import com.training.stream.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStreamBehaviour {

    public void collectBehaviour() {
        Stream<Integer> numbers = Stream.of(20, 5, 8, 5, 3, 3, 9);
        List<Integer> numList = numbers.distinct().collect(Collectors.toList());

        Stream<Person> people = Stream.of(new Person("James", 54),
                                          new Person("Martha", 52),
                                          new Person("Pilar", 67));
        Map<Integer, String> peopleList = people
                .collect(Collectors.toMap(Person::getAge, Person::getName));
    }

    public void collectGroupingByBehaviour() {
        Stream<Person> people = Stream.of(new Person("James", 54),
                new Person("Martha", 52),
                new Person("Pilar", 67));

        Map<Integer, List<Person>> peopleGroupingBy = people
                .collect(Collectors.groupingBy(Person::getAge));

        peopleGroupingBy.forEach((k, v) -> System.out.println(v));
    }

    public void orderEmployeesByDepartmentAndGetAvgSalary() {
        Stream<Employee> employees = Stream.of(new Employee("Marcos", "Sales", 1600),
                new Employee("Alice", "Sales", 1200),
                new Employee("Juan", "HR", 1100),
                new Employee("Alfonso", "Sales", 1310),
                new Employee("Elena", "HR", 1550));

        employees.collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((k, v) -> System.out.println(k + ":"
                        + v.stream().mapToDouble(Employee::getSalary).average()));
    }

    public void partitionCollectBehaviour() {
        Stream<Person> people = Stream.of(new Person("Juan", 15),
                new Person("Ana", 23),
                new Person("Bea", 16),
                new Person("Pedro", 34));

        Map<Boolean, List<Person>> peoplePartition = people
                .collect(Collectors.partitioningBy(p -> p.getAge() > 18));
    }

    public void averagingDoubleCollectBehaviour() {
        Stream<City> cities = Stream.of(new City("Vienna", 10.7),
                new City("Paris", 14.8),
                new City("Madrid", 20.5),
                new City("Seville", 24.0));

        System.out.println(cities.collect(Collectors.averagingDouble(City::getTemperature)));
    }

    public void summingIntCollectBehaviour() {
        Stream<Employee> employees = Stream.of(new Employee("Marcos", "Sales", 1600),
                new Employee("Alice", "Sales", 1200),
                new Employee("Juan", "HR", 1100),
                new Employee("Alfonso", "Sales", 1310),
                new Employee("Elena", "HR", 1550));

        System.out.println(employees.collect(Collectors.summingInt(e -> e.getSalary())));
    }

    public void joiningCollectBehaviour() {
        Stream<Person> people = Stream.of(new Person("Juan", 15),
                new Person("Ana", 23),
                new Person("Bea", 16),
                new Person("Pedro", 34));

        System.out.println(people.map(Person::getName).collect(Collectors.joining()));
    }
}
