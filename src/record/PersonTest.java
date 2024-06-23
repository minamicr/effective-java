package record;

import java.util.ArrayList;
import java.util.Comparator;

public class PersonTest {

  public record Person(String firstName, String lastName, String telNum) {};

  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<>();
    people.add(new Person("Cristina", "Minami", "3493409"));
    people.add(new Person("Aline", "Santos", "43049303"));
    System.out.println(people);

    people.sort(Comparator.comparing(Person::firstName));
    System.out.println(people);

  }

}
