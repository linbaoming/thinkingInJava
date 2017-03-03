package com.christer.thinkingInJava.generics;//: generics/ReturnGenericType.java

/**
 * 加边界的泛型用处主要是能返回确切的类型
 */
class ReturnGenericType<T extends HasF> {
  private T obj;
  public ReturnGenericType(T x) { obj = x; }
  public T get() { return obj; }
} ///:~
