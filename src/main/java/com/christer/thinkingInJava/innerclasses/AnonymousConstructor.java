package com.christer.thinkingInJava.innerclasses;//: innerclasses/AnonymousConstructor.java
// Creating a constructor for an anonymous inner class.
import static net.mindview.util.Print.*;

abstract class Base {
  public Base(int i) {
    print("Base constructor, i = " + i);
  }
  public abstract void f();
}

/**
 * 通过实例初始化 就能达到为匿名类创建一个构造器的效果
 */
public class AnonymousConstructor {
  public static Base getBase(int i) { // i无需是final的，因为是被传递给匿名类的基类的构造器的，并不会在匿名类内部被直接使用
    return new Base(i) {
      { print("Inside instance initializer"); }
      public void f() {
        print("In anonymous f()");
      }
    };
  }
  public static void main(String[] args) {
    Base base = getBase(47);
    base.f();
  }
} /* Output:
Base constructor, i = 47
Inside instance initializer
In anonymous f()
*///:~
