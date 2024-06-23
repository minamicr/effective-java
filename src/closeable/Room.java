package closeable;

import java.io.Closeable;
import java.lang.ref.Cleaner;

public class Room implements Closeable {
  private static final Cleaner cleaner = Cleaner.create();

  private static class State implements Runnable {
    int numJunkPiles;
    State(int numJunkPiles) {
      this.numJunkPiles = numJunkPiles;
    }

    @Override
    public void run() {
      System.out.println("Cleaning room");
      numJunkPiles = 0;
    }
  }

  final private Cleaner.Cleanable cleanable;

  public Room(int numJunkPiles) {
    State state = new State(numJunkPiles);
    cleanable = cleaner.register(this, state);
  }

  @Override
  public void close() {
    cleanable.clean();
  }
}
