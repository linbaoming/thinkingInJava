package com.christer.thinkingInJava.generics;//: generics/ErasedTypeEquivalence.java
import java.util.*;

/**
 * 类型擦除
 */
public class ErasedTypeEquivalence {
  public static void main(String[] args) {
    Class c1 = new ArrayList<String>().getClass();
    Class c2 = new ArrayList<Integer>().getClass();
    System.out.println(c1 == c2);
  }
} /* Output:
true
*///:~
