package com.christer.thinkingInJava.initialization;

/**
 * @author linboaming
 * @create 2017-02-07 17:42
 */
public class NewVarArgs {
    static void printArray(Object... args) {
        for(Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        // Can take individual elements:
        printArray(new Integer(47), new Float(3.14),
                new Double(11.11));
        printArray(47, 3.14F, 11.11);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
        // Or an array:
        printArray((Object[])new Integer[]{ 1, 2, 3, 4 });
        printArray(); // Empty list is OK
    }
}

/*
output:
47 3.14 11.11
47 3.14 11.11
one two three
com.christer.thinkingInJava.initialization.A@1b6d3586 com.christer.thinkingInJava.initialization.A@4554617c com.christer.thinkingInJava.initialization.A@74a14482
1 2 3 4
 */