package generics;

public class Generics{

  //LINDO, FUNCIONOU !!
  public static <T> void printArray(T[] type){
    for(T t: type)
      System.out.println(t);

  }

  public static void main(String[] args) {

    Integer[] integerArray = {2, 2, 3};
    String[] stringArray = {"Hello", "World"};

    printArray(integerArray);
    printArray(stringArray);

  }
}
