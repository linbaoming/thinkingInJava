package com.christer.thinkingInJava.generics;//: generics/Manipulation.java
// {CompileTimeError} (Won't compile)

/**
 * 因为擦除的关系，所以无法调用
 */
class Manipulator<T> {
  private T obj;
  public Manipulator(T x) { obj = x; }
  // Error: cannot find symbol: method f():
  public void manipulate() { obj.f(); }
}

public class Manipulation {
  public static void main(String[] args) {
    HasF hf = new HasF();
    Manipulator<HasF> manipulator =
      new Manipulator<HasF>(hf);
    manipulator.manipulate();
  }
} ///:~
