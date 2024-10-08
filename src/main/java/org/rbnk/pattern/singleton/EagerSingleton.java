package org.rbnk.pattern.singleton;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
    }

    public static EagerSingleton getInstance(){
        return instance;
    }

    public void somePrint(){
        System.out.println("some print");
    }
}
