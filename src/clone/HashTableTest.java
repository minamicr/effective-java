package clone;

import clone.HashTable.Entry;

public class HashTableTest {

  public static void main(String[] args) {
    Entry three = new HashTable.Entry(1, "three", null);
    Entry two = new HashTable.Entry(2, "two", three);
    Entry one = new HashTable.Entry(1, "one", two);

    HashTable.add(one);

    Entry[] result = HashTable.get();
    System.out.println(result[1]);

    Entry two_ = new HashTable.Entry(2, "two_", null);
    Entry one_ = new HashTable.Entry(1, "one_", two_);

    HashTable.add(one_);
    Entry[] result2 = result.clone();

    System.out.println(result2[1]);
    System.out.println(result[1]);

  }

}
