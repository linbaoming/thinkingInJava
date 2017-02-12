package com.christer.thinkingInJava.innerclasses;//: innerclasses/DotNew.java
// Creating an inner class directly using the .new syntax.

/**
 * 创建某外部类对象的内部类对象，外部类对象.new 内部类名()
 */
public class DotNew {
  public class Inner {}
  public static void main(String[] args) {
    DotNew dn = new DotNew();
    Inner dni = dn.new Inner();
  }
} ///:~
