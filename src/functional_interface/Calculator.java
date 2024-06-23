package functional_interface;

import java.util.function.IntBinaryOperator;

public class Calculator  {

  public static void main(String[] args) {
    System.out.println("sum: " + sum(2, 5));

    System.out.println("easySum: " + easySum(2, 5));

    System.out.println("lambda: " + lambdaSum(2, 5));
  }

  private static int sum(int number1, int number2) {
    CalculatorInterface sum = new CalculatorInterface() {
      @Override
      public int calculate(int number1, int number2) {

        return number1 + number2;
      }

    };

    return sum.calculate(number1, number2);

  }

  private static int easySum(int number1, int number2) {

    CalculatorInterface localSum = (num1, num2) -> num1 + num2;
    return localSum.calculate(number1, number2);

  }

  private static int lambdaSum(int number1, int number2) {
    IntBinaryOperator sum = (x, y) -> x + y;
    return sum(number1, number2);
  }
}
