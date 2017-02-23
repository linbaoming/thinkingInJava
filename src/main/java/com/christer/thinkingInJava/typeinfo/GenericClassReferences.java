package com.christer.thinkingInJava.typeinfo;//: typeinfo/GenericClassReferences.java

/**
 * 通过泛型方法可以限制类型
 */
public class GenericClassReferences {
  public static void main(String[] args) {
    Class intClass = int.class;
    Class<Integer> genericIntClass = int.class;
    genericIntClass = Integer.class; // Same thing
    intClass = double.class;
    // genericIntClass = double.class; // Illegal
  }
} ///:~
