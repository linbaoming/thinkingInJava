package com.christer.thinkingInJava.reusing;//: reusing/Lisa.java
// {CompileTimeError} (Won't compile)

class Lisa extends Homer {
  //@Override //增加这个就会编译不通过，override是覆写父类的这个方法，如果没有这个方法，不会进行重载，而是编译报错
  void doh(Milhouse m) {
    System.out.println("doh(Milhouse)");
  }
} ///:~
