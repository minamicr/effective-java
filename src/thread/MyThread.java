package thread;

public class MyThread extends Thread{
  public void run () {
    for ( int count = 1, row = 1; row < 20; row++, count++) {
      for (int i = 0; i < count; i++)
        System.out.println("*");

      System.out.println("\n");

    }
  }
}
