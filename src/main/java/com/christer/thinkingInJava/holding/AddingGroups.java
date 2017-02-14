package com.christer.thinkingInJava.holding;//: holding/AddingGroups.java
// Adding groups of elements to Collection objects.
import java.util.*;

/**
 * Arrays.asList()方法接受一个数组 或 一个用逗号分隔的元素对象列表，并将其转换为一个List对象
 * Collections.addAll()方法接受一个Collection对象 以及 一个数组 或 一个用逗号分隔的列表，将元素添加到Collection中
 *
 * 用Arrays.asList()方法生成的List，其底层是数组，不能用add()或delete()方法来添加或删除元素
 */
public class AddingGroups {
  public static void main(String[] args) {
    Collection<Integer> collection =
      new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    Integer[] moreInts = { 6, 7, 8, 9, 10 };
    collection.addAll(Arrays.asList(moreInts));
    // Runs significantly faster, but you can't
    // construct a Collection this way:
    Collections.addAll(collection, 11, 12, 13, 14, 15);
    Collections.addAll(collection, moreInts);
    // Produces a list "backed by" an array:
    List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
    list.set(1, 99); // OK -- modify an element
    // list.add(21); // Runtime error because the
                     // underlying array cannot be resized.
  }
} ///:~
