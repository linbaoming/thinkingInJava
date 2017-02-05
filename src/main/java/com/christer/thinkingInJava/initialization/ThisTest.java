package com.christer.thinkingInJava.initialization;

/**
 * this关键字
 * 编译器会自动加上此关键字
 * 只有需要明确指出对当前对象的引用时，才需要使用此关键字
 *
 * @author linboaming
 * @create 2017-02-05 23:51
 */
public class ThisTest {
    public static void main(String[] args) {
        Banana a = new Banana(),
                b = new Banana();
        // 编译器会做如下的工作
        a.peel(1); // Banana.peel(a, 1);
        b.peel(2); // Banana.peel(b, 2);

        Leaf x = new Leaf();
        x.increment().increment().increment().print(); // increment()通过返回this返回了对当前对象的引用

        new Person().eat(new Apple());
    }
}

class Banana {
    void peel(int i) { /* ... */ }

    void pick() { /* ... */ }
    void pit() { pick(); /* ... */ } // 编译器会自动添加this，如this.pick();
}

class Leaf {
    int i = 0;
    Leaf increment() {
        i++;
        return this;
    }
    void print() {
        System.out.println("i = " + i);
    }
}


class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        // ... remove peel
        return apple; // Peeled
    }
}

class Apple {
    Apple getPeeled() { return Peeler.peel(this); } // 将当前对象传递给其他方法
}