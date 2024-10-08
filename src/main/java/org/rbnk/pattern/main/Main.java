package org.rbnk.pattern.main;

import org.rbnk.pattern.builder.Person;
import org.rbnk.pattern.proxy.Computer;
import org.rbnk.pattern.proxy.impl.Laptop;
import org.rbnk.pattern.proxy.impl.LaptopProxy;
import org.rbnk.pattern.singleton.BestSingleton;
import org.rbnk.pattern.singleton.DoubleCheckSingleton;
import org.rbnk.pattern.singleton.EagerSingleton;
import org.rbnk.pattern.strategy.YouTubeViewer;
import org.rbnk.pattern.strategy.impl.Android;
import org.rbnk.pattern.strategy.impl.Ios;

public class Main {
    public static void main(String[] args) {
        //singleton
        BestSingleton.INSTANCE.somePrint();
        DoubleCheckSingleton.getInstance().somePrint();
        EagerSingleton.getInstance().somePrint();

        //builder
        Person person = Person.newBuilder()
                .id(1)
                .firstName("Bob")
                .lastName("Goodman")
                .age(18)
                .build();
        System.out.println(person);

        //proxy
        Computer computer = new Laptop();
        Computer computerProxy = new LaptopProxy();
        computer.watchYouTube();
        computerProxy.watchYouTube();

        //strategy
        YouTubeViewer firstViewer = new YouTubeViewer(new Android());
        YouTubeViewer secondViewer = new YouTubeViewer(new Ios());
        firstViewer.watch();
        secondViewer.watch();
    }
}
