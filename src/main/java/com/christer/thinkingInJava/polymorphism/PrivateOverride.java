//: polymorphism/PrivateOverride.java
// Trying to override a private method.
package com.christer.thinkingInJava.polymorphism;
import static net.mindview.util.Print.*;

/**
 * 由于private类不能被子类覆盖，所以调用基类的此方法，不会调到子类同名的public方法
 */
public class PrivateOverride {
  private void f() { print("private f()"); }
  public static void main(String[] args) {
    PrivateOverride po = new Derived();
    po.f();
  }
}

class Derived extends PrivateOverride {
  public void f() { print("public f()"); }
} /* Output:
private f()
*///:~
