package com.christer.thinkingInJava.initialization;

import static net.mindview.util.Print.*;

/**
 * 显式的静态初始化
 * @author linboaming
 * @create 2017-02-07 0:26
 */
public class ExplicitStatic {
    public static void main(String[] args) {
        print("Inside main()");
        Cups.cup1.f(99);  // (1)
    }
    // static Cups cups1 = new Cups();  // (2)
    // static Cups cups2 = new Cups();  // (2)
}

class Cup {
    Cup(int marker) {
        print("Cup(" + marker + ")");
    }
    void f(int marker) {
        print("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        print("Cups()");
    }
}

/**
 * 用静态代码块初始化
 */
class Spoon {
    static int i;
    static {
        i = 47;
    }
}


/*
output:
Inside main()
Cup(1)
Cup(2)
f(99)
 */