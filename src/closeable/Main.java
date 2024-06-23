package closeable;

public class Main {

  public static void main(String[] args) {

    //closeable.Room room = new closeable.Room(3);
    //room.close();

    try(Room myRoom = new Room(7)) {
      System.out.println("goodbye");
    }

    new Room(99);
    System.out.println("peace out");
    System.gc();

  }
}