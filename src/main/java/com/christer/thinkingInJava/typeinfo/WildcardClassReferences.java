package com.christer.thinkingInJava.typeinfo;//: typeinfo/WildcardClassReferences.java

/**
 * 通配符，虽与没有一样，表示选择了非具体的类型，但能表示不是疏忽
 */
public class WildcardClassReferences {
  public static void main(String[] args) {
    Class<?> intClass = int.class;
    intClass = double.class;
  }
} ///:~
