package com.christer.thinkingInJava.strings;//: strings/InfiniteRecursion.java
// Accidental recursion.
// {RunByHand}
import java.util.*;

/**
 * 如果希望toString方法打印出对象的内存地址，不可以用this关键字，会导致递归调用toString方法
 * 应该调用Object.toString，即super.toString
 */
public class InfiniteRecursion {
  public String toString() {
    return " InfiniteRecursion address: " + this + "\n";
  }
  public static void main(String[] args) {
    List<InfiniteRecursion> v =
      new ArrayList<InfiniteRecursion>();
    for(int i = 0; i < 10; i++)
      v.add(new InfiniteRecursion());
    System.out.println(v);
  }
} ///:~
