package com.christer.thinkingInJava.initialization;

/**
 * @author linboaming
 * @create 2017-02-07 0:52
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{ "fiddle", "de", "dum" });
    }
}

class Other {
    public static void main(String[] args) {
        for(String s : args)
            System.out.print(s + " ");
    }
}

/*
output:
fiddle de dum
 */