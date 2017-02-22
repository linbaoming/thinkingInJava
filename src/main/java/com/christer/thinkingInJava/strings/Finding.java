package com.christer.thinkingInJava.strings;//: strings/Finding.java
import java.util.regex.*;
import static net.mindview.util.Print.*;

/**
 * Matcher.find用来在CharSequence中查找多个匹配
 * 带参数的find可以设置搜索的起点
 */
public class Finding {
  public static void main(String[] args) {
    Matcher m = Pattern.compile("\\w+")
      .matcher("Evening is full of the linnet's wings");
    while(m.find())
      printnb(m.group() + " ");
    print();
    int i = 0;
    while(m.find(i)) {
      printnb(m.group() + " ");
      i++;
    }
  }
} /* Output:
Evening is full of the linnet s wings
Evening vening ening ning ing ng g is is s full full ull ll l of of f the the he e linnet linnet innet nnet net et t s s wings wings ings ngs gs s
*///:~
