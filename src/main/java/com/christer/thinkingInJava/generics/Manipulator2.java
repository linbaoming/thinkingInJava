package com.christer.thinkingInJava.generics;//: generics/Manipulator2.java

/**
 * 给定泛型类边界，便可调用相应的方法
 */
class Manipulator2<T extends HasF> {
  private T obj;
  public Manipulator2(T x) { obj = x; }
  public void manipulate() { obj.f(); }
} ///:~
