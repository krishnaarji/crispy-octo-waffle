public class ReverseSentence {

  public ReverseSentence() {

  }

  public void reverse(String str) {

    if (str == null)
      return;

    if (str.indexOf(' ') == -1)
      return;

    String reverse = "";
    boolean period = false;
    if(str.endsWith(".")) {
      str = str.substring(0, str.length()-1);
      period = true;
    } 
    
    String[] words = str.split(" ");
    for(int i = words.length-1;i >= 0;i--) {
      reverse = reverse + " " + words[i];  
    }  

    if (period)
      reverse = reverse + ".";

    System.out.println("Output: " + reverse.substring(1, reverse.length()));

  }

  public static void main(String[] args) {
    ReverseSentence rs = new ReverseSentence();
    rs.reverse("This is a sentence");
  }

}
