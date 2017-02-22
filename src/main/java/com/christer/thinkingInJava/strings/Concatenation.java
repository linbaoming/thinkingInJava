package com.christer.thinkingInJava.strings;//: strings/Concatenation.java

/**
 * 编译器会为程序自动引入StringBuilder类
 */
public class Concatenation {
  public static void main(String[] args) {
    String mango = "mango";
    String s = "abc" + mango + "def" + 47;
    System.out.println(s);
  }
} /* Output:
abcmangodef47
*///:~
