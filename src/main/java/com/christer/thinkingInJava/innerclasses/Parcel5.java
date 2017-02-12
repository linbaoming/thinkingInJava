package com.christer.thinkingInJava.innerclasses;//: innerclasses/Parcel5.java
// Nesting a class within a method.

/**
 * 在方法的作用域内（而不是在其它类的作用域内）创建一个完整的类，称为局部内部类
 */
public class Parcel5 {
  public Destination destination(String s) {
    class PDestination implements Destination {
      private String label;
      private PDestination(String whereTo) {
        label = whereTo;
      }
      public String readLabel() { return label; }
    }
    return new PDestination(s);
  }
  public static void main(String[] args) {
    Parcel5 p = new Parcel5();
    Destination d = p.destination("Tasmania");
  }
} ///:~
