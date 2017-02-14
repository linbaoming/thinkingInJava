package com.christer.thinkingInJava.holding;//: holding/StackTest.java
import net.mindview.util.*;

/**
 * 栈Stack是用LinkedList来实现的，但不能继承，因为只需要其中的一部分接口
 */
public class StackTest {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    for(String s : "My dog has fleas".split(" "))
      stack.push(s);
    while(!stack.empty())
      System.out.print(stack.pop() + " ");
  }
} /* Output:
fleas has dog My
*///:~
