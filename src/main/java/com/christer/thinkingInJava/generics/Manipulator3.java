package com.christer.thinkingInJava.generics;//: generics/Manipulator3.java

/**
 * 无法泛型也能实现
 */
class Manipulator3 {
  private HasF obj;
  public Manipulator3(HasF x) { obj = x; }
  public void manipulate() { obj.f(); }
} ///:~
