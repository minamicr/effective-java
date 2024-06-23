package generics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class StackArrayTest {

  @Test
  void stackArrayTest(){
    StackArray stackArray = new StackArray<String>();
    stackArray.push("teste1");
    stackArray.push("teste2");

    String result = stackArray.printStackArray();

    assertEquals(result, "teste1teste2");

  }

}
