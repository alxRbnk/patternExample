package org.rbnk.pattern.strategy;

import org.rbnk.pattern.proxy.Computer;

public class YouTubeViewer {
    private Smartphone smartphone;

    public YouTubeViewer(Smartphone smartphone){
        this.smartphone = smartphone;
    }

    public void watch(){
        smartphone.watchYouTube();
    }
}
