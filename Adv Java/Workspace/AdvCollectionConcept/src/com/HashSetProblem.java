package com;

import java.util.HashSet;
import java.util.Set;


public class HashSetProblem {

    static Set<String> users = new HashSet<>();

    public static void main(String[] args) {

    	
        Thread loginThread = new Thread(() -> {
            users.add("Alice");
            users.add("Bob");
        });

        Thread readThread = new Thread(() -> {
            for (String user : users) { // ❌ fail-fast
                System.out.println("Active user: " + user);
            }
        });

        loginThread.start();
        readThread.start();
    }
}
