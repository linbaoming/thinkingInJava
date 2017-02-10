package com.christer.thinkingInJava.reusing;//: reusing/Bath.java
// Constructor initialization with composition.
import static net.mindview.util.Print.*;

/**
 * 如果想初始化类中域的引用，可以在代码中的下列位置进行：
 * 1.在定义对象的地方
 * 2.在类的构造器中
 * 3.在正要使用这些对象之前，称为惰性初始化
 * 4.使用实例初始化
 */
class Soap {
  private String s;
  Soap() {
    print("Soap()");
    s = "Constructed"; // 2
  }
  public String toString() { return s; }
}	

public class Bath {
  private String // Initializing at point of definition:
    s1 = "Happy", // 1
    s2 = "Happy",
    s3, s4;
  private Soap castille;
  private int i;
  private float toy;
  public Bath() {
    print("Inside Bath()");
    s3 = "Joy";
    toy = 3.14f;
    castille = new Soap();
  }	
  // Instance initialization:
  { i = 47; } // 4
  public String toString() {
    if(s4 == null) // Delayed initialization:
      s4 = "Joy"; // 3
    return
      "s1 = " + s1 + "\n" +
      "s2 = " + s2 + "\n" +
      "s3 = " + s3 + "\n" +
      "s4 = " + s4 + "\n" +
      "i = " + i + "\n" +
      "toy = " + toy + "\n" +
      "castille = " + castille;
  }	
  public static void main(String[] args) {
    Bath b = new Bath();
    print(b);
  }
} /* Output:
Inside Bath()
Soap()
s1 = Happy
s2 = Happy
s3 = Joy
s4 = Joy
i = 47
toy = 3.14
castille = Constructed
*///:~
