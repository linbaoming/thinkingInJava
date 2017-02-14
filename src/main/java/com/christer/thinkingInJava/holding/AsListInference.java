package com.christer.thinkingInJava.holding;//: holding/AsListInference.java
// Arrays.asList() makes its best guess about type.
import java.util.*;

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

/**
 * Arrays.asList()方法的限制是它对所产生的List的类型做出了最理想的假设，而并没有注意你会赋予什么样的类型
 * Collections.addAll()方法则从第一个参数中了解到了目标类型是什么
 *
 */
public class AsListInference {
  public static void main(String[] args) {
    List<Snow> snow1 = Arrays.asList(
      new Crusty(), new Slush(), new Powder());

    // Won't compile:
    // List<Snow> snow2 = Arrays.asList(
    //   new Light(), new Heavy());   // 从参数里推导出要创建的类型是List<Powder>
    // Compiler says:
    // found   : java.util.List<Powder>
    // required: java.util.List<Snow>

    // Collections.addAll() doesn't get confused:
    List<Snow> snow3 = new ArrayList<Snow>();
    Collections.addAll(snow3, new Light(), new Heavy());

    // Give a hint using an
    // explicit type argument specification:
    List<Snow> snow4 = Arrays.<Snow>asList( // 显示类型参数说明
       new Light(), new Heavy());
  }
} ///:~
