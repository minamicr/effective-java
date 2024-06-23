package comparable.mountain;

import java.util.Collections;
import java.util.LinkedList;

public class SortMountainsComparable {

  LinkedList<MountainComparable> mtn = new LinkedList<MountainComparable>();

  public static void main(String[] args) {
    new SortMountainsComparable().go();
  }

  public void go () {
    mtn.add(new MountainComparable("Longs", 14255));
    mtn.add(new MountainComparable("Elbert", 14433));
    mtn.add(new MountainComparable("Maroon", 14156));
    mtn.add(new MountainComparable("Castle", 14265));

    System.out.println("as entered: \n" + mtn.toString());

    Collections.sort(mtn);
    System.out.println("by height: \n" + mtn);

  }
}
