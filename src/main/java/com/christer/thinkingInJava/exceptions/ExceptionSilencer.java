package com.christer.thinkingInJava.exceptions;//: exceptions/ExceptionSilencer.java

/**
 * 更简单的异常丢失，在finally子句中返回
 */
public class ExceptionSilencer {
  public static void main(String[] args) {
    try {
      throw new RuntimeException();
    } finally {
      // Using 'return' inside the finally block
      // will silence any thrown exception.
      return;
    }
  }
} ///:~
