package com.christer.thinkingInJava.innerclasses;//: innerclasses/Parcel7b.java
// Expanded version of Parcel7.java

/**
 * 匿名内部类的语法是下述形式的简化形式
 */
public class Parcel7b {
  class MyContents implements Contents {
    private int i = 11;
    public int value() { return i; }
  }
  public Contents contents() { return new MyContents(); }
  public static void main(String[] args) {
    Parcel7b p = new Parcel7b();
    Contents c = p.contents();
  }
} ///:~
