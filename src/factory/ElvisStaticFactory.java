package factory;

public class ElvisStaticFactory {

  private static final ElvisStaticFactory INSTANCE = new ElvisStaticFactory();

  private ElvisStaticFactory() {
    System.out.println("Elvis Static Factory constructor");
  }

  public static ElvisStaticFactory getInstance(){
    return INSTANCE;
  }

  public void leaveTheBuilding(){
    System.out.println("Elvis Static Factory leave the building");
  }
}
