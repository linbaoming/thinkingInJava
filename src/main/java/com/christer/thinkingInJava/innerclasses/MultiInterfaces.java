//: innerclasses/MultiInterfaces.java
// Two ways that a class can implement multiple interfaces.
package com.christer.thinkingInJava.innerclasses;

interface A {}
interface B {}

class X implements A, B {}

class Y implements A {
  B makeB() {
    // Anonymous inner class:
    return new B() {};
  }
}

/**
 * 每个内部类都能独立地继承自一个实现，所以无论外围类是否已经继承了某个实现，对于内部类都没有影响
 * 通过内部类来实现多个接口
 */
public class MultiInterfaces {
  static void takesA(A a) {}
  static void takesB(B b) {}
  public static void main(String[] args) {
    X x = new X();
    Y y = new Y();
    takesA(x);
    takesA(y);
    takesB(x);
    takesB(y.makeB());
  }
} ///:~
