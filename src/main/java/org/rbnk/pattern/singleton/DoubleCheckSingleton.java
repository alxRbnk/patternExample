package org.rbnk.pattern.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton instance;
    private static final Lock lock = new ReentrantLock();

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            lock.lock();
            try {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }

    public void somePrint(){
        System.out.println("double check singleton");
    }
}
