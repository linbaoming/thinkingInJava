package com.christer.thinkingInJava.innerclasses;//: innerclasses/Parcel3.java
// Using .new to create instances of inner classes.

/**
 * 因为内部类对象会暗暗地连接到创建它的外部类对象上
 * 所以创建内部类对象时需要用到外部类的对象.new
 */
public class Parcel3 {
  class Contents {
    private int i = 11;
    public int value() { return i; }
  }
  class Destination {
    private String label;
    Destination(String whereTo) { label = whereTo; }
    String readLabel() { return label; }
  }
  public static void main(String[] args) {
    Parcel3 p = new Parcel3();
    // Must use instance of outer class
    // to create an instance of the inner class:
    Contents c = p.new Contents();
    Destination d = p.new Destination("Tasmania");
  }
} ///:~
