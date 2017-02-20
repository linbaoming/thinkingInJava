package com.christer.thinkingInJava.exceptions;//: exceptions/WhoCalled.java
// Programmatic access to stack trace information.

/**
 * getStackTrace方法为printStackTrace所调用
 * 返回一个由栈轨迹中的元素所构成的数组
 */
public class WhoCalled {
  static void f() {
    // Generate an exception to fill in the stack trace
    try {
      throw new Exception();
    } catch (Exception e) {
      for(StackTraceElement ste : e.getStackTrace())
        System.out.println(ste.getMethodName());
    }
  }
  static void g() { f(); }
  static void h() { g(); }
  public static void main(String[] args) {
    f();
    System.out.println("--------------------------------");
    g();
    System.out.println("--------------------------------");
    h();
  }
} /* Output:
f
main
--------------------------------
f
g
main
--------------------------------
f
g
h
main
*///:~
