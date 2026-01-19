package com;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueProblem {

    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                queue.add(i);
                System.out.println("Produced " + i);
            }
        });

        Thread consumer = new Thread(() -> {
            while (!queue.isEmpty()) {
                System.out.println("Consumed " + queue.poll());
            }
        });

        producer.start();
        consumer.start();
    }
}
