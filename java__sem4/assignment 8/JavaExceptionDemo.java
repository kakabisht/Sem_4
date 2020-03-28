
class Myexception extends Exception {

  private static final long serialVersionUID = 1L;
  int n;
  String str1;

  Myexception(String str2) {
    str1 = str2;
  }

  public String toString() {
    return ("MyException Occurred: " + str1);
  }

  public static int conversion(String s1) {
    int x;
    try {
      x = Integer.parseInt(s1);

    } catch (Exception e) {
      System.out.println("Error at int conversion method" + e.getMessage());
      x = 0;
    }
    return x;
  }

  public static int range(int x) {
    if (x > 0 && x < 12)
      return 1;
    else
      return 0;

  }

  public static int yourexp(int x) throws Myexception  {
    int z= range(x);
    if (z== 1)
      return x;
    else if (z == 0) {
      throw new Myexception(" Out of Range 0 to 12 ");
    }
    return 404;
  }

  public static void fac(int x) {
    int i, fac = 1;
    for (i = 1; i <= x; i++) {
      fac *= i;
    }
    System.out.println("Factorial : " + fac);
  }

}

public class JavaExceptionDemo extends Myexception {

  JavaExceptionDemo(String str2) {
    super(str2);
  }

  private static final long serialVersionUID = 1L;

  public static void main(String[] args) {

    int i;
    System.out
        .println("\n NumberFormatException (ill-formed CLA) \n And \nYour Exception class MyExcep( n<0 and n>12 )\n ALL the Incorrect Values will be displayed as 404 \n");
    int len = args.length;
    int[] array = new int[len];

    System.out.println("\n Conversion to int from string \t");
    for (i = 0; i < len; i++) {
      array[i] = conversion(args[i]);
    }

    System.out.println("\n Checking condition \t");
    for (i = 0; i < len-1; i++) {
        System.out.println(i);
        try {
        
          if (yourexp(array[i]) != 0) {
            array[i] = yourexp(array[i]);
          }
        } catch (Myexception e) {
          System.out.println("Error at checking condition" );
          e.printStackTrace();
         
        }
        
      }

      System.out.println("\n Factorial display \t");
      for (i = 0; i < len; i++) {
        fac(array[i]);
        }
  
  
  }
}
  