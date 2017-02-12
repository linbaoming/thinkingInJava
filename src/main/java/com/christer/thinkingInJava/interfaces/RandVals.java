//: interfaces/RandVals.java
// Initializing interface fields with
// non-constant initializers.
package com.christer.thinkingInJava.interfaces;
import java.util.*;

/**
 * 接口中的域不能是空final，但是可以被非常量表达式初始化
 * static域在类被加载的时候才初始化
 */
public interface RandVals {
  Random RAND = new Random(47);
  int RANDOM_INT = RAND.nextInt(10);
  long RANDOM_LONG = RAND.nextLong() * 10;
  float RANDOM_FLOAT = RAND.nextLong() * 10;
  double RANDOM_DOUBLE = RAND.nextDouble() * 10;
} ///:~
