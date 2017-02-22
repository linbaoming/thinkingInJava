package com.christer.thinkingInJava.strings;//: strings/ArrayListDisplay.java
import com.christer.thinkingInJava.generics.coffee.*;
import java.util.*;

/**
 * ArrayList.toString会遍历ArrayList中包含的所有对象，调用每个元素上的toString方法
 */
public class ArrayListDisplay {
  public static void main(String[] args) {
    ArrayList<Coffee> coffees = new ArrayList<Coffee>();
    for(Coffee c : new CoffeeGenerator(10))
      coffees.add(c);
    System.out.println(coffees);
  }
} /* Output:
[Americano 0, Latte 1, Americano 2, Mocha 3, Mocha 4, Breve 5, Americano 6, Latte 7, Cappuccino 8, Cappuccino 9]
*///:~
