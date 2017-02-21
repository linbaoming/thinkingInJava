package com.christer.thinkingInJava.exceptions;//: exceptions/NeverCaught.java
// Ignoring RuntimeExceptions.
// {ThrowsException}

/**
 * RuntimeException如果没有被捕获而直达main()，那么在程序退出前将调用异常的printStackTrace方法
 */
public class NeverCaught {
  static void f() {
    throw new RuntimeException("From f()");
  }
  static void g() {
    f();
  }
  public static void main(String[] args) {
    g();
  }
} ///:~
