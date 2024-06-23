package factory;

public class ElvisFinalField {

  public static final ElvisFinalField INSTANCE = new ElvisFinalField();

  private ElvisFinalField() {
    System.out.println("Elvis Final Field constructor");
  }

  public void leaveTheBuilding(){
    System.out.println("Elvis Final Field leave the building");
  }
}
