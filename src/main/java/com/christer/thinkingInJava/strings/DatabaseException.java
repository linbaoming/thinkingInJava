package com.christer.thinkingInJava.strings;//: strings/DatabaseException.java

/**
 * 可以使用String.format来格式化，与使用Formatter类一样的参数，因为其内部也是用Formatter来实现的
 */
public class DatabaseException extends Exception {
  public DatabaseException(int transactionID, int queryID,
    String message) {
    super(String.format("(t%d, q%d) %s", transactionID,
        queryID, message));
  }
  public static void main(String[] args) {
    try {
      throw new DatabaseException(3, 7, "Write failed");
    } catch(Exception e) {
      System.out.println(e);
    }
  }
} /* Output:
DatabaseException: (t3, q7) Write failed
*///:~
