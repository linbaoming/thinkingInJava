package com.christer.thinkingInJava.innerclasses;//: innerclasses/Parcel9.java
// An anonymous inner class that performs
// initialization. A briefer version of Parcel5.java.

/**
 * 在匿名内部类中定义字段时，还能够对其执行初始化
 * 这里由于内部类希望使用一个在其外部类定义的对象，要求参数为final，如果是外部类的域，则无此要求
 */
public class Parcel9 {
  // Argument must be final to use inside
  // anonymous inner class:
  public Destination destination(final String dest) {
    return new Destination() {
      private String label = dest;
      public String readLabel() { return label; }
    };
  }
  public static void main(String[] args) {
    Parcel9 p = new Parcel9();
    Destination d = p.destination("Tasmania");
  }
} ///:~
