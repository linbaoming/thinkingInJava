package com.christer.thinkingInJava.polymorphism;//: polymorphism/PolyConstructors.java
// Constructors and polymorphism
// don't produce what you might expect.
import static net.mindview.util.Print.*;

class Glyph {
  void draw() { print("Glyph.draw()"); }
  Glyph() {
    print("Glyph() before draw()");
    draw();
    print("Glyph() after draw()");
  }
}	

class RoundGlyph extends Glyph {
  private int radius = 1;
  RoundGlyph(int r) {
    radius = r;
    print("RoundGlyph.RoundGlyph(), radius = " + radius);
  }
  void draw() {
    print("RoundGlyph.draw(), radius = " + radius);
  }
}

/**
 * 在构造器内部调用动态绑定方法，可以调用到方法，但其中的域并未初始化
 * 构造器内唯一安全调用的方法是基类中final方法。
 * 正确的初始化顺序：
 * 1.在其它任何事物发生之前，将分配给对象的存储空间初始化为0
 * 2.调用基类构造器
 * 3.按照声明的顺序调用成员的初始化方法
 * 4.调用导出类的构造器主体
 */
public class PolyConstructors {
  public static void main(String[] args) {
    new RoundGlyph(5);
  }
} /* Output:
Glyph() before draw()
RoundGlyph.draw(), radius = 0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
*///:~
