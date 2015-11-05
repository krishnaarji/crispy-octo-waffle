import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.HashSet;

public class LongestWord {

  public LongestWord() {
  }

  public static void main(String[] args) {
    TreeSet ts = new TreeSet();
    ts.add("Krishna");
    ts.add("Samarth");
    ts.add("Anchith");
    ts.add("Krishna");
    System.out.println("TreeSet : " + ts);

    HashSet hs = new HashSet();    
    hs.add("Krishna");
    hs.add("Samarth");
    hs.add("Anchith");
    hs.add("Krishna");
    System.out.println("HashSet : " + hs);
  }

}
