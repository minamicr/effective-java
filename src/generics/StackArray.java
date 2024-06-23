package generics;

import java.util.Arrays;

public class StackArray <E> {
  private E[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;

  @SuppressWarnings("unchecked")
  public StackArray() {
    elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];

  }

  public void push(E e){
    ensureCapacity();
    elements[size++] = e;
  }

  public E pop(){
    if (size == 0)
      throw new NullPointerException();
    E result = elements[--size];
    elements[size] = null;
    return result;
  }
  private void ensureCapacity() {
    if (elements.length == size)
      elements = Arrays.copyOf(elements, 2 * size + 1);
  }

  public String printStackArray(){
    StringBuilder result = new StringBuilder();

    for(E e:elements) {
      if (e != null)
        result.append(e);
    }

    return result.toString();
  }
}
