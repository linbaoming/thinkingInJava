package com.christer.thinkingInJava.initialization;

/**
 * @author linboaming
 * @create 2017-02-07 21:23
 */
public class SimpleEnumUse {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);

        for(Spiciness s : Spiciness.values())
            System.out.println(s + ", ordinal " + s.ordinal());

        Burrito.main(args);
    }
}

class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree) { this.degree = degree;}
    public void describe() {
        System.out.print("This burrito is ");
        switch(degree) {
            case NOT:    System.out.println("not spicy at all.");
                break;
            case MILD:
            case MEDIUM: System.out.println("a little hot.");
                break;
            case HOT:
            case FLAMING:
            default:     System.out.println("maybe too hot.");
        }
    }
    public static void main(String[] args) {
        Burrito
                plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}

/*
output:
MEDIUM

NOT, ordinal 0
MILD, ordinal 1
MEDIUM, ordinal 2
HOT, ordinal 3
FLAMING, ordinal 4

This burrito is not spicy at all.
This burrito is a little hot.
This burrito is maybe too hot.
 */