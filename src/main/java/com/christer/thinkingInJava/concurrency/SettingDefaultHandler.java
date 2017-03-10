package com.christer.thinkingInJava.concurrency;//: concurrency/SettingDefaultHandler.java
import java.util.concurrent.*;

/**
 * 统一设置未捕获异常处理器
 */
public class SettingDefaultHandler {
  public static void main(String[] args) {
    Thread.setDefaultUncaughtExceptionHandler(
      new MyUncaughtExceptionHandler());
    ExecutorService exec = Executors.newCachedThreadPool();
    exec.execute(new ExceptionThread());
  }
} /* Output:
caught java.lang.RuntimeException
*///:~
