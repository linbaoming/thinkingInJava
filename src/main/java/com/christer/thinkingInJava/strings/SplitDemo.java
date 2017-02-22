package com.christer.thinkingInJava.strings;//: strings/SplitDemo.java
import java.util.regex.*;
import java.util.*;
import static net.mindview.util.Print.*;

/**
 * 正则分割，可以指定将输入分割成字符串的数量
 */
public class SplitDemo {
  public static void main(String[] args) {
    String input =
      "This!!unusual use!!of exclamation!!points";
    print(Arrays.toString(
      Pattern.compile("!!").split(input)));
    // Only do the first three:
    print(Arrays.toString(
      Pattern.compile("!!").split(input, 3)));
  }
} /* Output:
[This, unusual use, of exclamation, points]
[This, unusual use, of exclamation!!points]
*///:~
