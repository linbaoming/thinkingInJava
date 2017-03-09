package com.christer.thinkingInJava.annotations;//: annotations/SimulatingNull.java
import java.lang.annotation.*;

/**
 * 非基本类型元素，不能以null作为其值，这个约束使得处理器很难表现一个元素的存在或缺失的状态，
 * 为了绕开这个约束，我们只能自已定义一些特殊的值，如空字符串或负数来表示某个元素不存在
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SimulatingNull {
  public int id() default -1;
  public String description() default "";
} ///:~
