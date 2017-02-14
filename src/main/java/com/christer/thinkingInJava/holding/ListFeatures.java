package com.christer.thinkingInJava.holding;//: holding/ListFeatures.java
import com.christer.thinkingInJava.typeinfo.pets.*;
import java.util.*;
import static net.mindview.util.Print.*;

/**
 * List:
 * ArrayList 优：随机访问快  劣：插入和移除元素时较慢
 * LinkedList 优：插入和删除较快，优化的顺序访问  劣：随机访问慢
 */
public class ListFeatures {
  public static void main(String[] args) {
    Random rand = new Random(47);
    List<Pet> pets = Pets.arrayList(7);
    print("1: " + pets); // [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]
    Hamster h = new Hamster();
    pets.add(h);
    print("2: " + pets); // [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster]
    print("3: " + pets.contains(h)); // true
    pets.remove(h);
    Pet p = pets.get(2);
    print("4: " +  p + " " + pets.indexOf(p)); // Cymric 2
    Pet cymric = new Cymric();
    print("5: " + pets.indexOf(cymric)); // -1
    print("6: " + pets.remove(cymric)); // false
    // Must be the exact object:
    print("7: " + pets.remove(p)); // true
    print("8: " + pets); // [Rat, Manx, Mutt, Pug, Cymric, Pug]
    pets.add(3, new Mouse());
    print("9: " + pets); // [Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug]
    List<Pet> sub = pets.subList(1, 4);
    print("subList: " + sub); // [Manx, Mutt, Mouse]
    print("10: " + pets.containsAll(sub)); // true
    Collections.sort(sub);
    print("sorted subList: " + sub); // [Manx, Mouse, Mutt]
    // Order is not important in containsAll():
    print("11: " + pets.containsAll(sub)); // true
    Collections.shuffle(sub, rand);
    print("shuffled subList: " + sub); // [Mouse, Manx, Mutt]
    print("12: " + pets.containsAll(sub)); // true
    List<Pet> copy = new ArrayList<Pet>(pets);
    sub = Arrays.asList(pets.get(1), pets.get(4));
    print("sub: " + sub); // [Mouse, Pug]
    copy.retainAll(sub);
    print("13: " + copy); // [Mouse, Pug]
    copy = new ArrayList<Pet>(pets); // Get a fresh copy
    copy.remove(2);
    print("14: " + copy); // [Rat, Mouse, Mutt, Pug, Cymric, Pug]
    copy.removeAll(sub);
    print("15: " + copy); // [Rat, Mutt, Cymric, Pug]
    copy.set(1, new Mouse());
    print("16: " + copy); // [Rat, Mouse, Cymric, Pug]
    copy.addAll(2, sub);
    print("17: " + copy); // [Rat, Mouse, Mouse, Pug, Cymric, Pug]
    print("18: " + pets.isEmpty()); // false
    pets.clear();
    print("19: " + pets); // []
    print("20: " + pets.isEmpty()); // true
    pets.addAll(Pets.arrayList(4));
    print("21: " + pets); // [Manx, Cymric, Rat, EgyptianMau]
    Object[] o = pets.toArray();
    print("22: " + o[3]); // EgyptianMau
    Pet[] pa = pets.toArray(new Pet[0]);
    print("23: " + pa[3].id()); // 14
  }
} /* Output:
1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]
2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster]
3: true
4: Cymric 2
5: -1
6: false
7: true
8: [Rat, Manx, Mutt, Pug, Cymric, Pug]
9: [Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug]
subList: [Manx, Mutt, Mouse]
10: true
sorted subList: [Manx, Mouse, Mutt]
11: true
shuffled subList: [Mouse, Manx, Mutt]
12: true
sub: [Mouse, Pug]
13: [Mouse, Pug]
14: [Rat, Mouse, Mutt, Pug, Cymric, Pug]
15: [Rat, Mutt, Cymric, Pug]
16: [Rat, Mouse, Cymric, Pug]
17: [Rat, Mouse, Mouse, Pug, Cymric, Pug]
18: false
19: []
20: true
21: [Manx, Cymric, Rat, EgyptianMau]
22: EgyptianMau
23: 14
*///:~
