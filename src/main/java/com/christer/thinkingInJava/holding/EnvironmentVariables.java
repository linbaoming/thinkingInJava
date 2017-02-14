package com.christer.thinkingInJava.holding;//: holding/EnvironmentVariables.java
import java.util.*;

/**
 * 显示所有的操作系统环境变量
 */
public class EnvironmentVariables {
  public static void main(String[] args) {
    for(Map.Entry entry: System.getenv().entrySet()) {
      System.out.println(entry.getKey() + ": " +
        entry.getValue());
    }
  }
} /* (Execute to see output) *///:~
