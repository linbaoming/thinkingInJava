package com.christer.thinkingInJava.initialization;

/**
 *
 * @author linboaming
 * @create 2017-02-06 21:31
 */
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);// 有引用指向该对象，则不会被垃圾回收
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference, forget to clean up:
        new Book(true); // 没有引用指向该对象，则会被垃圾回收
        // Force garbage collection & finalization:
        System.gc();
    }
}

class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    /**
     * 一旦垃圾回收器准备好释放对象占用的存储空间，将首先调用其finalize()方法，
     * 并且在下一次垃圾回收动作发生时，才会真正回收对象占用的内存。
     *
     * 1.对象可能不被垃圾回收
     * 2.垃圾回收并不等于析构
     * 3.垃圾回收只与内存有关
     *
     * 特殊用途：通过某种创建对象方式以外的方式为对象分配存储空间
     * 如C或C++来创建的对象，需要在finalize()中调用本地方法来释放
     *
     * 可以用来发现未被垃圾回收的对象
     */
    protected void finalize() {
        if (checkedOut)
            System.out.println("Error: checked out");
        // Normally, you'll also do this:
        // super.finalize(); // Call the base-class version
    }
}

/*
output:
Error: checked out
 */