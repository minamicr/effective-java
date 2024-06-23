package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

  public static void main(String[] args) {
    Height height = new Height();
    height.setHeight(350);

    Box myBox = new Box();
    myBox.setHeight(height);
    myBox.setWidth(120);

    writeObject(myBox);
    readObject();

    writeObject(myBox);


  }

  private static void writeObject(Object obj){
    try {
      FileOutputStream fs = new FileOutputStream("foo.ser");
      ObjectOutputStream os = new ObjectOutputStream(fs);
      os.writeObject(obj);
      os.close();

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  private static void readObject(){
    try {
      FileInputStream fs = new FileInputStream("foo.ser");
      ObjectInputStream os = new ObjectInputStream(fs);
      Box box = (Box)os.readObject();
      os.close();
      System.out.println("Box width " + box.getWidth() + " height " + box.getHeight().getHeight());

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}

