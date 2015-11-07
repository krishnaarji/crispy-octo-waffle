public class Test {

  public Test() {
  }

  public String divide(int num, int den) {

   if (num > den)
     return null;

   if (num < 0 || den < 0)
     return null;

   boolean stop = false;
   String str = "";
   int index = 0;

   while (!stop) {
     int coe = num/den;
     int rem = num%den; 

     if ((coe == 0) && (rem == num)) {
       num = num * 10;
       continue;
     }

     if (str.indexOf(String.valueOf(coe)) != -1) {
      index = str.indexOf(String.valueOf(coe));
      stop = true; 
     } else {
      str = str + coe;
      num = rem;
     }
   }
 
   if (index != 0)
     str = "0." + str.substring(0,index) + "("+ str.substring(index,str.length()) + ")";
   else
     str = "0." + "(" + str + ")";
 

   return str;
  }

  public static void main(String[] args) {
    // 1/3 = 0.(3)
    // 11/90 = 0.1(2)
    // 1/7 = 0.(124587)

    Test t = new Test();
    System.out.println(t.divide(1,7));
  }

}
