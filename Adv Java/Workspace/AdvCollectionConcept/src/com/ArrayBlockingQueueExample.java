package com;

import java.util.concurrent.*;

public class ArrayBlockingQueueExample {

    static BlockingQueue<Integer> queue =new ArrayBlockingQueue<>(1);

    public static void main(String[] args) {

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.put(i); // blocks if full
                    System.out.println("Produced " + i);
                }
            } catch (Exception e) {}
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Consumed " + queue.take());
                }
            } catch (Exception e) {}
        });

        producer.start();
        consumer.start();
    }
}

