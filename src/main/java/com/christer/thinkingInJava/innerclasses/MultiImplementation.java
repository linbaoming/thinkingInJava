//: innerclasses/MultiImplementation.java
// With concrete or abstract classes, inner
// classes are the only way to produce the effect
// of "multiple implementation inheritance."
package com.christer.thinkingInJava.innerclasses;

class D {}
abstract class E {}

class Z extends D {
  E makeE() { return new E() {}; }
}

/**
 * 如果拥有的是抽象的类或具体的类，而不是接口，那就只能使用内部类才能实现多重继承
 *
 * 使用内部类还可以获得其它一些特性
 * 1.内部类可以有多个实例，每个实例都有自已的状态信息，并且与其外围类对象的信息相互独立
 * 2.在单个外围类中，可以让多个内部类以不同的方式实现同一个接口
 * 3.创建内部类对象的时刻并不依赖于外围类对象的创建
 * 4.内部类并没有令人迷惑的"is-a"关系，它就是一个独立的实体
 */
public class MultiImplementation {
  static void takesD(D d) {}
  static void takesE(E e) {}
  public static void main(String[] args) {
    Z z = new Z();
    takesD(z);
    takesE(z.makeE());
  }
} ///:~
