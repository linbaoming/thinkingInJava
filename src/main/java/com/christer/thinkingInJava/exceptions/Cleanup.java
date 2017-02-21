package com.christer.thinkingInJava.exceptions;//: exceptions/Cleanup.java
// Guaranteeing proper cleanup of a resource.

/**
 * 对于在构造阶段可能会抛出异常并且要求清理的类，最安全的使用方式是使用嵌套的try子句
 * 如果构造失败，将进入外部的catch子句，而dispose不会被调用
 * 但是构造成功，无论如何都会调用dispose
 * 以上是通用的清理惯用法，在构造器不抛异常时也应该应用
 * 规则：在创建需要清理的对象之后，立即进入一个try-finally
 */
public class Cleanup {
  public static void main(String[] args) {
    try {
      InputFile in = new InputFile("Cleanup.java");
      try {
        String s;
        int i = 1;
        while((s = in.getLine()) != null)
          ; // Perform line-by-line processing here...
      } catch(Exception e) {
        System.out.println("Caught Exception in main");
        e.printStackTrace(System.out);
      } finally {
        in.dispose();
      }
    } catch(Exception e) {
      System.out.println("InputFile construction failed");
    }
  }
} /* Output:
dispose() successful
*///:~
