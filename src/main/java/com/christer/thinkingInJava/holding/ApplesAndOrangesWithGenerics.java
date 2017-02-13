package com.christer.thinkingInJava.holding;//: holding/ApplesAndOrangesWithGenerics.java
import java.util.*;

/**
 * 使用了泛型，取出时无需转型
 * 并且在定义时就已决定能存放什么对象，如果存放其它对象将报错
 */
public class ApplesAndOrangesWithGenerics {
  public static void main(String[] args) {
    ArrayList<Apple> apples = new ArrayList<Apple>();
    for(int i = 0; i < 3; i++)
      apples.add(new Apple());
    // Compile-time error:
    // apples.add(new Orange());
    for(int i = 0; i < apples.size(); i++)
      System.out.println(apples.get(i).id());
    // Using foreach:
    for(Apple c : apples)
      System.out.println(c.id());
  }
} /* Output:
0
1
2
0
1
2
*///:~
