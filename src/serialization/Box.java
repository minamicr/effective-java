package serialization;

import java.io.Serializable;

public class Box implements Serializable {
  private Height height;
  private int width;


  public Height getHeight() {
    return height;
  }

  public void setHeight(Height height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }
}
