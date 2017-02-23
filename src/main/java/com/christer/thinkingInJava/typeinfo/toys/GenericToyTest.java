//: typeinfo/toys/GenericToyTest.java
// Testing class Class.
package com.christer.thinkingInJava.typeinfo.toys;

/**
 * ?与Super结合，表示限定为此类的超类
 */
public class GenericToyTest {
  public static void main(String[] args) throws Exception {
    Class<FancyToy> ftClass = FancyToy.class;
    // Produces exact type:
    FancyToy fancyToy = ftClass.newInstance(); // 通过泛型可以直接取到返回的类型，不用转型
    Class<? super FancyToy> up = ftClass.getSuperclass(); // 只能这么写，不能像下面一样具体
    //Class<Toy> up = ftClass.getSuperclass();
    // This won't compile:
    // Class<Toy> up2 = ftClass.getSuperclass(); // 由于上面的含糊，因此也不能直接转为具体类型，只能用Object来引用
    // Only produces Object:
    Object obj = up.newInstance();
  }
} ///:~
