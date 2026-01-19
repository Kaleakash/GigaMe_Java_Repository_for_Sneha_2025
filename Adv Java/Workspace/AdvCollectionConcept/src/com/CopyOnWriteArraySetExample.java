package com;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {

    static CopyOnWriteArraySet<String> subscribers =new CopyOnWriteArraySet<>();

    public static void main(String[] args) {

        subscribers.add("EmailUser");
        subscribers.add("SMSUser");

        Thread notifier = new Thread(() -> {
            for (String s : subscribers) {
                System.out.println("Notify: " + s);
            }
        });

        Thread newSubscriber = new Thread(() -> {
            subscribers.add("PushUser");
        });

        notifier.start();
        newSubscriber.start();
    }
}

