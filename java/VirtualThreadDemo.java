/*
40. Virtual Threads (Java 21)
• Objective: Use lightweight threads for scalable concurrency.
• Task: Launch 100,000 virtual threads that each print a message.
• Instructions:
o Use Thread.startVirtualThread(() -> { ... }).
o Measure performance versus traditional threads.
*/

import java.util.ArrayList;
import java.util.List;

public class VirtualThreadDemo {

    public static void main(String[] args) throws Exception {

        int count = 100_000;

        long startVirtual = System.currentTimeMillis();

        List<Thread> virtualThreads = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            Thread t = Thread.startVirtualThread(() -> {
                // minimal work
                int x = 1 + 1;
            });
            virtualThreads.add(t);
        }

        for (Thread t : virtualThreads) {
            t.join();
        }

        long endVirtual = System.currentTimeMillis();

        System.out.println("Virtual Threads Time: " + (endVirtual - startVirtual) + " ms");


        int platformCount = 1000;

        long startPlatform = System.currentTimeMillis();

        List<Thread> platformThreads = new ArrayList<>();

        for (int i = 0; i < platformCount; i++) {
            Thread t = new Thread(() -> {
                int x = 1 + 1;
            });
            t.start();
            platformThreads.add(t);
        }

        for (Thread t : platformThreads) {
            t.join();
        }

        long endPlatform = System.currentTimeMillis();

        System.out.println("Platform Threads Time: " + (endPlatform - startPlatform) + " ms");
    }
}