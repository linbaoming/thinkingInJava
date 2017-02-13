package com.christer.thinkingInJava.innerclasses;//: innerclasses/BigEgg.java
// An inner class cannot be overriden like a method.
import static net.mindview.util.Print.*;

class Egg {
  private Yolk y;
  protected class Yolk {
    public Yolk() { print("Egg.Yolk()"); }
  }
  public Egg() {
    print("New Egg()");
    y = new Yolk();
  }
}

/**
 * 内部类不能被覆盖
 */
public class BigEgg extends Egg {
  public class Yolk {
    public Yolk() { print("BigEgg.Yolk()"); }
  }
  public static void main(String[] args) {
    new BigEgg();
  }
} /* Output:
New Egg()
Egg.Yolk()
*///:~
