package com.christer.thinkingInJava.exceptions;//: exceptions/WithFinally.java
// Finally Guarantees cleanup.

/**
 * 用finally来关闭除内存之外的资源
 */
public class WithFinally {
  static Switch sw = new Switch();
  public static void main(String[] args) {
    try {
      sw.on();
      // Code that can throw exceptions...
      OnOffSwitch.f();
    } catch(OnOffException1 e) {
      System.out.println("OnOffException1");
    } catch(OnOffException2 e) {
      System.out.println("OnOffException2");
    } finally {
      sw.off();
    }
  }
} /* Output:
on
off
*///:~
