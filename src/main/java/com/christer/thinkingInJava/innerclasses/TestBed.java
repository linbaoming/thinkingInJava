package com.christer.thinkingInJava.innerclasses;//: innerclasses/TestBed.java
// Putting test code in a nested class.
// {main: TestBed$Tester}

/**
 * 嵌套类来放置测试代码
 */
public class TestBed {
  public void f() { System.out.println("f()"); }
  public static class Tester {
    public static void main(String[] args) {
      TestBed t = new TestBed();
      t.f();
    }
  }
} /* Output:
f()
*///:~
