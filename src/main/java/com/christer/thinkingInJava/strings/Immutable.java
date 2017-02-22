package com.christer.thinkingInJava.strings;//: strings/Immutable.java
import static net.mindview.util.Print.*;

/**
 * String中每一个看起来会修改String值的方法，实际上都是创建了一个全新的String对象
 */
public class Immutable {
  public static String upcase(String s) {
    return s.toUpperCase();
  }
  public static void main(String[] args) {
    String q = "howdy";
    print(q); // howdy
    String qq = upcase(q);
    print(qq); // HOWDY
    print(q); // howdy
  }
} /* Output:
howdy
HOWDY
howdy
*///:~
