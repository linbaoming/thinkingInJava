package com.christer.thinkingInJava.holding;//: holding/LinkedListFeatures.java
import com.christer.thinkingInJava.typeinfo.pets.*;
import java.util.*;
import static net.mindview.util.Print.*;

/**
 * LinkedList插入和删除时比ArrayList高效，随机访问操作逊色些
 * LinkedList还添加了可以使其用作栈，队列或双端队列的方法
 */
public class LinkedListFeatures {
  public static void main(String[] args) {
    LinkedList<Pet> pets =
      new LinkedList<Pet>(Pets.arrayList(5));
    print(pets); // [Rat, Manx, Cymric, Mutt, Pug]
    // 以下三个一样，都是返回列表头并不移除，如果List为空，前两个抛NoSuchElementException异常，后面那个返回null
    print("pets.getFirst(): " + pets.getFirst()); // Rat
    print("pets.element(): " + pets.element()); // Rat
    print("pets.peek(): " + pets.peek()); // Rat
    // 以下三个一样，都是移除并返回列表头，如果List为空，前两个抛NoSuchElementException异常，后面那个返回null
    print("pets.remove(): " + pets.remove()); // Rat
    print("pets.removeFirst(): " + pets.removeFirst()); // Manx
    print("pets.poll(): " + pets.poll()); // Cymric
    print(pets); // [Mutt, Pug]
    pets.addFirst(new Rat());
    print("After addFirst(): " + pets); // [Rat, Mutt, Pug]
    pets.offer(Pets.randomPet());
    print("After offer(): " + pets); // [Rat, Mutt, Pug, Cymric]
    pets.add(Pets.randomPet());
    print("After add(): " + pets); // [Rat, Mutt, Pug, Cymric, Pug]
    pets.addLast(new Hamster());
    print("After addLast(): " + pets); // [Rat, Mutt, Pug, Cymric, Pug, Hamster]
    print("pets.removeLast(): " + pets.removeLast()); // Hamster
  }
} /* Output:
[Rat, Manx, Cymric, Mutt, Pug]
pets.getFirst(): Rat
pets.element(): Rat
pets.peek(): Rat
pets.remove(): Rat
pets.removeFirst(): Manx
pets.poll(): Cymric
[Mutt, Pug]
After addFirst(): [Rat, Mutt, Pug]
After offer(): [Rat, Mutt, Pug, Cymric]
After add(): [Rat, Mutt, Pug, Cymric, Pug]
After addLast(): [Rat, Mutt, Pug, Cymric, Pug, Hamster]
pets.removeLast(): Hamster
*///:~
