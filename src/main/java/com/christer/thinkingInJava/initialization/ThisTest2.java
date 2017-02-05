package com.christer.thinkingInJava.initialization;

import static net.mindview.util.Print.*;

/**
 * this关键字
 * 在构造器中调用构造器，必须将构造器调用置于最起始处，否则编译器会报错
 * static方法就是没有this的方法，在其方法内部不能调用非静态方法
 * @author linboaming
 * @create 2017-02-06 0:12
 */
public class ThisTest2 {
    int petalCount = 0;
    String s = "initial value";
    ThisTest2(int petals) {
        petalCount = petals;
        print("Constructor w/ int arg only, petalCount= "
                + petalCount);
    }
    ThisTest2(String ss) {
        print("Constructor w/ String arg only, s = " + ss);
        s = ss;
    }
    ThisTest2(String s, int petals) {
        this(petals);
        //！ this(s); // 不用调用两个构造器
        this.s = s; // Another use of "this"
        print("String & int args");
    }
    ThisTest2() {
        this("hi", 47);
        print("default constructor (no args)");
    }
    void printPetalCount() {
        //! this(11); // 不能在其它方法中调用构造器
        print("petalCount = " + petalCount + " s = "+ s);
    }
    public static void main(String[] args) {
        ThisTest2 x = new ThisTest2();
        x.printPetalCount();
    }
}

/*
output:
Constructor w/ int arg only, petalCount= 47
String & int args
default constructor (no args)
petalCount = 47 s = hi
 */
