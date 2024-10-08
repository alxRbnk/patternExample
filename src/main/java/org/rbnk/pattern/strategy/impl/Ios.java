package org.rbnk.pattern.strategy.impl;

import org.rbnk.pattern.strategy.Smartphone;

public class Ios implements Smartphone {
    @Override
    public void watchYouTube() {
        System.out.println("watch youtube on Ios");
    }
}
