package com.christer.thinkingInJava.generics;//: generics/Holder3.java

/**
 * 泛型核心：告诉编译器想使用什么类型，然后编译器帮你处理一切细节
 * @param <T>
 */
public class Holder3<T> {
  private T a;
  public Holder3(T a) { this.a = a; }
  public void set(T a) { this.a = a; }
  public T get() { return a; }
  public static void main(String[] args) {
    Holder3<Automobile> h3 =
      new Holder3<Automobile>(new Automobile());
    Automobile a = h3.get(); // No cast needed
    // h3.set("Not an Automobile"); // Error
    // h3.set(1); // Error
  }
} ///:~
