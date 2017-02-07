package com.christer.thinkingInJava.initialization;

/**
 * @author linboaming
 * @create 2017-02-07 17:38
 */
public class VarArgs {
    static void printArray(Object[] args) {
        for(Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47), new Float(3.14), new Double(11.11)
        });
        printArray(new Object[]{"one", "two", "three" });
        printArray(new Object[]{new A(), new A(), new A()});
    }
}

class A {}

/*
output:
47 3.14 11.11
one two three
com.christer.thinkingInJava.initialization.A@1b6d3586 com.christer.thinkingInJava.initialization.A@4554617c com.christer.thinkingInJava.initialization.A@74a14482
 */