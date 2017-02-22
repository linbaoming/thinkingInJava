package com.christer.thinkingInJava.strings;//: strings/Resetting.java
import java.util.regex.*;

/**
 * 不带参的reset方法可以将Matcher对象重新设置到当前字符序列的起始位置
 * 带参数的可以应用于一个新的字符序列
 */
public class Resetting {
  public static void main(String[] args) throws Exception {
    Matcher m = Pattern.compile("[frb][aiu][gx]")
      .matcher("fix the rug with bags");
    while(m.find())
      System.out.print(m.group() + " ");
    System.out.println();
    m.reset("fix the rig with rags");
    while(m.find())
      System.out.print(m.group() + " ");
  }
} /* Output:
fix rug bag
fix rig rag
*///:~
