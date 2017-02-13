package com.christer.thinkingInJava.innerclasses;//: innerclasses/ClassInInterface.java
// {main: ClassInInterface$Test}

/**
 * 接口内嵌套类，放在接口里的嵌套类都是public和static的，嵌套类也可以实现接口
 */
public interface ClassInInterface {
  void howdy();
  class Test implements ClassInInterface {
    public void howdy() {
      System.out.println("Howdy!");
    }
    public static void main(String[] args) {
      new Test().howdy();
    }
  }
} /* Output:
Howdy!
*///:~
