package org.rbnk.pattern.proxy.impl;

import org.rbnk.pattern.proxy.Computer;

public class LaptopProxy extends Laptop implements Computer {
    @Override
    public void watchYouTube() {
        System.out.println("add log");
        super.watchYouTube();
    }
}
