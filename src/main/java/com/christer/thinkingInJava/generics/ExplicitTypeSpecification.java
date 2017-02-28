package com.christer.thinkingInJava.generics;//: generics/ExplicitTypeSpecification.java
import com.christer.thinkingInJava.typeinfo.pets.*;
import java.util.*;
import net.mindview.util.*;

/**
 * 显式的类型说明
 * 在点操作符与方法名之间插入尖括号，然后把类型置于尖括号内
 * 如果在定义该方法的类的内部，必须在点前加this，如果是static，在点前加类名
 * 仅在编写非赋值语句时才需要
 */
public class ExplicitTypeSpecification {
  static void f(Map<Person, List<Pet>> petPeople) {}
  public static void main(String[] args) {
    f(New.<Person, List<Pet>>map());
  }
} ///:~
