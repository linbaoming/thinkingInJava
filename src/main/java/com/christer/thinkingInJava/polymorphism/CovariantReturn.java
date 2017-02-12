package com.christer.thinkingInJava.polymorphism;//: polymorphism/CovariantReturn.java

class Grain {
  public String toString() { return "Grain"; }
}

class Wheat extends Grain {
  public String toString() { return "Wheat"; }
}

class Mill {
  Grain process() { return new Grain(); }
}

class WheatMill extends Mill {
  Wheat process() { return new Wheat(); }
}

/**
 * 多态中的动态绑定方法的返回值，子类方法返回类型 可以是 同基类方法返回类型 或 基类方法返回类型的子类型
 */
public class CovariantReturn {
  public static void main(String[] args) {
    Mill m = new Mill();
    Grain g = m.process();
    System.out.println(g);
    m = new WheatMill();
    g = m.process();
    System.out.println(g);
  }
} /* Output:
Grain
Wheat
*///:~
