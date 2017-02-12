package com.christer.thinkingInJava.innerclasses;//: innerclasses/DotThis.java
// Qualifying access to the outer-class object.

/**
 * 在内部类中生成对外部类对象的引用，外部类名.this
 */
public class DotThis {
  void f() { System.out.println("DotThis.f()"); }
  public class Inner {
    public DotThis outer() {
      return DotThis.this;
      // A plain "this" would be Inner's "this"
    }
  }
  public Inner inner() { return new Inner(); }
  public static void main(String[] args) {
    DotThis dt = new DotThis();
    Inner dti = dt.inner();
    dti.outer().f();
  }
} /* Output:
DotThis.f()
*///:~
