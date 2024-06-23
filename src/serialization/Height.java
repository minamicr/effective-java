package serialization;

import java.io.Serializable;

public class Height implements Serializable {
  private int height;

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }
}
