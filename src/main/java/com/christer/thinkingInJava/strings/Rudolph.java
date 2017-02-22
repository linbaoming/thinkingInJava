package com.christer.thinkingInJava.strings;//: strings/Rudolph.java

/**
 * 成功匹配Rudolph字符串的几个例子
 */
public class Rudolph {
  public static void main(String[] args) {
    for(String pattern : new String[]{ "Rudolph",
      "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*" })
      System.out.println("Rudolph".matches(pattern));
  }
} /* Output:
true
true
true
true
*///:~
