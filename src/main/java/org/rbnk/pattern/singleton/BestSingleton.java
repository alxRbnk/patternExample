package org.rbnk.pattern.singleton;

public enum BestSingleton {
    INSTANCE;

    public void somePrint(){
        System.out.println("This is the best singleton");
    }
}