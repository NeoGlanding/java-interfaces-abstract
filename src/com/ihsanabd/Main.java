package com.ihsanabd;

import java.util.concurrent.locks.Lock;

public class Main {
    public static void main(String[] args) {
        Phone ihsanPhone = new Phone("Samsung", "202020A", "S20");
        Dog jackson = new Dog("Jackson", 20);
        InnerClass lock = new InnerClass("Budi");
        InnerClass.Inner xl = new lock.Inner("Slk");
    }

//    Inner Class
}
