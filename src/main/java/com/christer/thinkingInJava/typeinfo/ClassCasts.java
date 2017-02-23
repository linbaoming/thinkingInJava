package com.christer.thinkingInJava.typeinfo;//: typeinfo/ClassCasts.java

class Building {}
class House extends Building {}

/**
 * 新的转型语法
 */
public class ClassCasts {
  public static void main(String[] args) {
    Building b = new House();
    Class<House> houseType = House.class;
    House h = houseType.cast(b);
    h = (House)b; // ... or just do this.
  }
} ///:~
