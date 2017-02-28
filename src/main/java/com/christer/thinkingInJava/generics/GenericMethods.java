package com.christer.thinkingInJava.generics;//: generics/GenericMethods.java

/**
 * 类非泛型，方法为泛型方法
 * 注意：对于一个static的方法而言，无法访问泛型类的类型参数，所以，如果static方法需要使用泛型能力，就必须使其成为泛型方法
 * 使用泛型类时需要在创建时指定类型参数的值，但使用泛型方法不需要指定，编译器会进行类型参数推断
 */
public class GenericMethods {
  public <T> void f(T x) {
    System.out.println(x.getClass().getName());
  }
  public static void main(String[] args) {
    GenericMethods gm = new GenericMethods();
    gm.f("");
    gm.f(1);
    gm.f(1.0);
    gm.f(1.0F);
    gm.f('c');
    gm.f(gm);
  }
} /* Output:
java.lang.String
java.lang.Integer
java.lang.Double
java.lang.Float
java.lang.Character
GenericMethods
*///:~
