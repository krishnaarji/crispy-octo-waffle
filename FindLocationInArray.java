public class FindLocationInArray {

  public FindLocationInArray() {
  }

  public void findLocation(int[] array, int item) {
    int first = 0;
    int last = 0;
    boolean found = false;

    if (array.length == 0) {
      return;
    }

    for (int i = 0; i < array.length; i++) {
      if (array[i] == item) {
        if (!found) {
          first = last = i;
          found = true;
        } else
          last = i;
      }
    }
   
    if (found)
      System.out.println("First=" + first + " Last ="+ last);
    else
      System.out.println("Did not find the element");
  }

  public static void main(String[] args) {

    FindLocationInArray fl = new FindLocationInArray();
    int[] x = {1,3,4,5,4,6};
    fl.findLocation(x, 4);
  }
}
