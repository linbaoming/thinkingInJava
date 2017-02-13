//: innerclasses/Callbacks.java
// Using inner classes for callbacks
package com.christer.thinkingInJava.innerclasses;
import static net.mindview.util.Print.*;

interface Incrementable {
  void increment();
}

// Very simple to just implement the interface:
class Callee1 implements Incrementable {
  private int i = 0;
  public void increment() {
    i++;
    print(i);
  }
}	

class MyIncrement {
  public void increment() { print("Other operation"); }
  static void f(MyIncrement mi) { mi.increment(); }
}	

// If your class must implement increment() in
// some other way, you must use an inner class:
class Callee2 extends MyIncrement {
  private int i = 0;
  public void increment() {
    super.increment();
    i++;
    print(i);
  }
  private class Closure implements Incrementable {
    public void increment() {
      // Specify outer-class method, otherwise
      // you'd get an infinite recursion:
      Callee2.this.increment();
    }
  }
  Incrementable getCallbackReference() {
    return new Closure();
  }
}	

class Caller {
  private Incrementable callbackReference;
  Caller(Incrementable cbh) { callbackReference = cbh; }
  void go() { callbackReference.increment(); }
}

/**
 * 在Callee2已有increment()方法的情况下，不能让其再继承Incrementable
 * 只能使用内部类独立地实现不能让其再继承Incrementable
 * 不影响外围类的接口
 *
 * 内部类实现了Incrementable，以提供一个返回Callee2的钩子，
 * 而且是一个安全的钩子，只能调increment()方法，不像指针可以做很多事
 */
public class Callbacks {
  public static void main(String[] args) {
    Callee1 c1 = new Callee1();
    Callee2 c2 = new Callee2();
    MyIncrement.f(c2);
    Caller caller1 = new Caller(c1);
    Caller caller2 = new Caller(c2.getCallbackReference());
    caller1.go();
    caller1.go();
    caller2.go();
    caller2.go();
  }	
} /* Output:
Other operation
1
1
2
Other operation
2
Other operation
3
*///:~
