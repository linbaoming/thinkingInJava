package com.christer.thinkingInJava.typeinfo;//: typeinfo/BoundedClassReferences.java

/**
 * ?与extends结合，创建一个范围，表示限定为此类或其子类型
 */
public class BoundedClassReferences {
  public static void main(String[] args) {
    Class<? extends Number> bounded = int.class;
    bounded = double.class;
    bounded = Number.class;
    // Or anything else derived from Number.
  }
} ///:~
