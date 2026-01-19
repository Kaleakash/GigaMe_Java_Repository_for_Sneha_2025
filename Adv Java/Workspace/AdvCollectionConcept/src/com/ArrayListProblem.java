package com;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem {

	static CopyOnWriteArrayList<String> auditLogs =
            new CopyOnWriteArrayList<>();
//	static List<String> auditLogs =
//            new ArrayList<>();

    public static void main(String[] args) {
    	
        Thread writer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                auditLogs.add("LOG-" + i);
            }
        });

        Thread reader = new Thread(() -> {
            for (String log : auditLogs) { // ❌ fail-fast
                System.out.println("Reading: " + log);
            }
        });

        writer.start();
        reader.start();
    }
}

