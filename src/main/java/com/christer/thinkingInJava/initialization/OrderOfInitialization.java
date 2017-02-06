package com.christer.thinkingInJava.initialization;

import static net.mindview.util.Print.*;

/**
 * @author linboaming
 * @create 2017-02-06 22:19
 */
public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f(); // Shows that construction is done
    }
}

// When the constructor is called to create a
// Window object, you'll see a message:
class Window {
    Window(int marker) { print("Window(" + marker + ")"); }
}

/**
 * 变量定义的先后顺序决定了初始化的顺序，且在任何方法包括构造器被调用前得到初始化
 */
class House {
    Window w1 = new Window(1); // Before constructor
    House() {
        // Show that we're in the constructor:
        print("House()");
        w3 = new Window(33); // Reinitialize w3
    }
    Window w2 = new Window(2); // After constructor
    void f() { print("f()"); }
    Window w3 = new Window(3); // At end
}

/**
 * 自动初始化会先执行，即i先被置为0再被构造器置为7
 */
class Counter {
    int i;
    Counter() { i = 7; }
    // ...
}

/*
output:
Window(1)
Window(2)
Window(3)
House()
Window(33)
f()
 */