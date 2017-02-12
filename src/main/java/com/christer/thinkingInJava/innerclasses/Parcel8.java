package com.christer.thinkingInJava.innerclasses;//: innerclasses/Parcel8.java
// Calling the base-class constructor.

/**
 * 使用有参数的构造器的匿名内部类
 */
public class Parcel8 {
  public Wrapping wrapping(int x) {
    // Base constructor call:
    return new Wrapping(x) { // Pass constructor argument.
      public int value() {
        return super.value() * 47;
      }
    }; // Semicolon required
  }
  public static void main(String[] args) {
    Parcel8 p = new Parcel8();
    Wrapping w = p.wrapping(10);
  }
} ///:~
