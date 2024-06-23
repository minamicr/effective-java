package clone;


import java.util.Arrays;

public class HashTable implements Cloneable {

  private static Entry[] buckets = new Entry[1];

  public static Entry[] add(Entry entry) {
    ensureCapacity();
    buckets[buckets.length-1] = entry;
    return buckets;
  }

  private static void ensureCapacity() {
      buckets = Arrays.copyOf(buckets, buckets.length + 1);
  }
  public static Entry[] get() {
    return buckets;
  }


  @Override
  public HashTable clone() {
    try {
      HashTable result = (HashTable) super.clone();
      result.buckets = buckets.clone();
      return result;

    } catch(CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }

  public static class Entry {
    final Object key;
    Object value;
    Entry next;

    Entry(Object key, Object value, Entry next) {
      this.key = key;
      this.value = value;
      this.next = next;

    }

    @Override
    public String toString() {
      return "Entry{" +
          "key=" + key +
          ", value=" + value +
          ", next=" + next +
          '}';
    }
  }

}
