package com.christer.thinkingInJava.generics;//: generics/LimitsOfInference.java
import com.christer.thinkingInJava.typeinfo.pets.*;
import java.util.*;

/**
 * 类型参数推导只对赋值操作有效，其它时候并不起作用
 * 赋值 可以通过声明的变量确定泛型类型
 * 方法参数 只是传值，不能倒过来用参数类型来确定泛型类型
 */
public class LimitsOfInference {
  static void
  f(Map<Person, List<? extends Pet>> petPeople) {}
  public static void main(String[] args) {
    // f(New.map()); // Does not compile 无法推断map里的类型
    f(new HashMap<Person, List<? extends Pet>>());
  }
} ///:~
