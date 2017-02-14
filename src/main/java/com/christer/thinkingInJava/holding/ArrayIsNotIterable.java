package com.christer.thinkingInJava.holding;//: holding/ArrayIsNotIterable.java
import java.util.*;

/**
 * foreach可以用于数组或其它任何Iterable，但不意味着数组是一个Iterable，而任何自动包装都不会自动发生
 */
public class ArrayIsNotIterable {
  static <T> void test(Iterable<T> ib) {
    for(T t : ib)
      System.out.print(t + " ");
  }
  public static void main(String[] args) {
    test(Arrays.asList(1, 2, 3));
    String[] strings = { "A", "B", "C" };
    // An array works in foreach, but it's not Iterable:
    //! test(strings);
    // You must explicitly convert it to an Iterable:
    test(Arrays.asList(strings));
  }
} /* Output:
1 2 3 A B C
*///:~
