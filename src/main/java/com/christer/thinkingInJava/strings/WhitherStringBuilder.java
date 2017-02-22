package com.christer.thinkingInJava.strings;//: strings/WhitherStringBuilder.java

/**
 * 在循环内动态构造字符串，需用StringBuilder，否则会每循环一次就会创建一个新的StringBuilder对象
 */
public class WhitherStringBuilder {
  public String implicit(String[] fields) {
    String result = "";
    for(int i = 0; i < fields.length; i++)
      result += fields[i];
    return result;
  }
  public String explicit(String[] fields) {
    StringBuilder result = new StringBuilder();
    for(int i = 0; i < fields.length; i++)
      result.append(fields[i]);
    return result.toString();
  }
} ///:~
