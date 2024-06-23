package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonTest {

  public static void minAge() {
    Person alex = new Person("Alex", 23);
    Person john = new Person("John", 40);
    Person peter = new Person("Peter", 32);
    List<Person> people = Arrays.asList(alex, john, peter);

    // then
    Person minByAge = people
        .stream()
        .min(Comparator.comparing(Person::getAge))
        .orElseThrow(NullPointerException::new);

    System.out.println(minByAge);
  }

  public static void main(String[] args) {
    minAge();
  }

}
