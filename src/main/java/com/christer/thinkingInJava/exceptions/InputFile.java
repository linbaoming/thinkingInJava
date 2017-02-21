package com.christer.thinkingInJava.exceptions;//: exceptions/InputFile.java
// Paying attention to exceptions in constructors.
import java.io.*;

/**
 * 直接向上层抛出能简化编程
 */
public class InputFile {
  private BufferedReader in;
  public InputFile(String fname) throws Exception {
    try {
      in = new BufferedReader(new FileReader(fname));
      // Other code that might throw exceptions
    } catch(FileNotFoundException e) {
      System.out.println("Could not open " + fname);
      // 文件还未打开，无需处理异常
      throw e;
    } catch(Exception e) {
      // 其它异常都必需关闭文件
      try {
        in.close();
      } catch(IOException e2) {
        System.out.println("in.close() unsuccessful");
      }
      throw e;
    } finally {
      // 所以不能统一在这里关闭文件
    }
  }
  public String getLine() {
    String s;
    try {
      s = in.readLine();
    } catch(IOException e) {
      throw new RuntimeException("readLine() failed");
    }
    return s;
  }
  public void dispose() {
    try {
      in.close();
      System.out.println("dispose() successful");
    } catch(IOException e2) {
      throw new RuntimeException("in.close() failed");
    }
  }
} ///:~
