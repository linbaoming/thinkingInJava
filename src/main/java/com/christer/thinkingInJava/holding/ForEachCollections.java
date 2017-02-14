package com.christer.thinkingInJava.holding;//: holding/ForEachCollections.java
// All collections work with foreach.
import java.util.*;

/**
 * Collection容器可以用ForEach语法
 * 之所以可以，是因为Iterable接口，该接口包含一个可以产生Iterator的iterator()方法
 * 并且Iterable被foreach用来在序列中移动
 */
public class ForEachCollections {
  public static void main(String[] args) {
    Collection<String> cs = new LinkedList<String>();
    Collections.addAll(cs,
      "Take the long way home".split(" "));
    for(String s : cs)
      System.out.print("'" + s + "' ");
  }
} /* Output:
'Take' 'the' 'long' 'way' 'home'
*///:~
