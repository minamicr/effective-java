package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VenkatBook {

  public record Person (String name, int age, String surname ) {};

  public static void test() {
    List<String> names = Arrays.asList("Claudia", "Ana", "Gisele", "Beatriz", "Carla");


    Optional<Integer> min = names.stream().map(nome -> nome.length())
        .reduce(BinaryOperator.minBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1)));

    names.stream().filter(nome -> nome.length() == min.get())
            .forEach(System.out::println);

    System.out.println(" min " + min.get());

//    Predicate<String> filter = (name) -> name.startsWith("C");
//    names.stream().filter(filter)
//        .forEach(System.out::println);
  }

  public static void testObject() {
    List<Person> people = new ArrayList<>();
    people.add(new Person("Ana", 34, "Furtado"));
    people.add(new Person("Carla", 30, "Nascimento"));
    people.add(new Person("Elisa", 50, "Sampaio"));
    people.add(new Person("Beatriz", 13, "Almada"));

    Predicate<String> nameFilter = (name) -> name.startsWith("C");
    Predicate<Person> ageFilter = (person) -> person.age >= 30 && person.age < 50;
    List<Person> peopleFiltered = people.stream().filter(ageFilter)
        .collect(Collectors.toList());
    peopleFiltered.stream().forEach(System.out::println);

  }
  public static void main(String[] args) {
    test();
  }
}
