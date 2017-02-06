package com.christer.thinkingInJava.initialization;

import static net.mindview.util.Print.*;

/**
 * 总结对象的创建过程
 * 1.即使没有显式地使用static关键字，构造器实际上也是静态方法。因此，创建对象或首次访问静态方法/静态域时，查找相应的类
 * 2.载入类，并执行所有静态初始化。因此，静态初始化只在类首次加载时进行一次
 * 3.用new创建对象时，先在堆上分配存储空间
 * 4.初始化这块存储空间
 * 5.执行所有出现于字段定义处的初始化动作
 * 6.执行构造器
 * @author linboaming
 * @create 2017-02-06 22:43
 */
public class StaticInitialization {
    public static void main(String[] args) {
        print("Creating new Cupboard() in main");
        new Cupboard();
        print("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}

class Bowl {
    Bowl(int marker) {
        print("Bowl(" + marker + ")");
    }
    void f1(int marker) {
        print("f1(" + marker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);
    Table() {
        print("Table()");
        bowl2.f1(1);
    }
    void f2(int marker) {
        print("f2(" + marker + ")");
    }
    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard() {
        print("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int marker) {
        print("f3(" + marker + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}

/*
output:
Bowl(1)
Bowl(2)
Table()
f1(1)
Bowl(4)
Bowl(5)
Bowl(3)
Cupboard()
f1(2)
Creating new Cupboard() in main
Bowl(3)
Cupboard()
f1(2)
Creating new Cupboard() in main
Bowl(3)
Cupboard()
f1(2)
f2(1)
f3(1)
 */