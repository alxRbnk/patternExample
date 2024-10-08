package org.rbnk.pattern.strategy;

public class YouTubeViewer {
    private final Smartphone smartphone;

    public YouTubeViewer(Smartphone smartphone){
        this.smartphone = smartphone;
    }

    public void watch(){
        smartphone.watchYouTube();
    }
}
