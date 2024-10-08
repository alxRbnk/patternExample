package org.rbnk.pattern.proxy.impl;

import org.rbnk.pattern.proxy.Computer;

public class Laptop implements Computer {
    @Override
    public void watchYouTube() {
        System.out.println("get news");
    }
}
