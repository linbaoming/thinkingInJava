package com.christer.thinkingInJava.reusing;//: reusing/Wind.java
// Inheritance & upcasting.

class Instrument {
  public void play() {}
  static void tune(Instrument i) {
    // ...
    i.play();
  }
}

/**
 * 向上转型
 * 判断是使用继承还是组合：判断是否需要向上转型，如果必须，则继承是必要的，否则使用组合
 */
public class Wind extends Instrument {
  public static void main(String[] args) {
    Wind flute = new Wind();
    Instrument.tune(flute); // Upcasting
  }
} ///:~
