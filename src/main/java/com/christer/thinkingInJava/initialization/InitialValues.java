package com.christer.thinkingInJava.initialization;

import static net.mindview.util.Print.*;

/**
 * 类的数据成员都会有一个初始值，而方法的局部变量未初始化则会编译出错
 *
 * @author linboaming
 * @create 2017-02-06 21:57
 */
public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;
    void printInitialValues() {
        print("Data type      Initial value");
        print("boolean        " + t);
        print("char           [" + c + "]");
        print("byte           " + b);
        print("short          " + s);
        print("int            " + i);
        print("long           " + l);
        print("float          " + f);
        print("double         " + d);
        print("reference      " + reference);
    }
    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();
    /* You could also say:
    new InitialValues().printInitialValues();
    */
    }
}

/**
 * 定义类成员变量时为其赋值
 */
class InitialValues2 {
    boolean bool = true;
    char ch = 'x';
    byte b = 47;
    short s = 0xff;
    int i = 999;
    long lng = 1;
    float f = 3.14f;
    double d = 3.14159;
    Depth depth = new Depth();
}

class Depth {}

/**
 * 可以通过调用某个方法来提供初值
 */
class MethodInit {
    int i = f();
    int f() { return 11; }
}

/**
 * 方法也可以带参数，但这些参数必须是已经被初始化
 */
class MethodInit2 {
    //! int j = g(i);
    int i = f();
    int j = g(i);
    int f() { return 11; }
    int g(int n) { return n * 10; }
}
/*
output:
Data type      Initial value
boolean        false
char           [ ]
byte           0
short          0
int            0
long           0
float          0.0
double         0.0
reference      null
 */