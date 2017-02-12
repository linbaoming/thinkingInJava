package com.christer.thinkingInJava.innerclasses;//: innerclasses/Parcel10.java
// Using "instance initialization" to perform
// construction on an anonymous inner class.

/**
 * 实例初始化充当构造器，但仅有一个这样的构造器
 * 只能实现一个接品或继承一个类
 */
public class Parcel10 {
  public Destination
  destination(final String dest, final float price) {
    return new Destination() {
      private int cost;
      // Instance initialization for each object:
      {
        cost = Math.round(price);
        if(cost > 100)
          System.out.println("Over budget!");
      }
      private String label = dest;
      public String readLabel() { return label; }
    };
  }	
  public static void main(String[] args) {
    Parcel10 p = new Parcel10();
    Destination d = p.destination("Tasmania", 101.395F);
  }
} /* Output:
Over budget!
*///:~
