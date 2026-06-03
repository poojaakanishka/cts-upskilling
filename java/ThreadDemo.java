/*
26. Thread Creation
• Objective: Implement multithreading.
• Task: Create and run two threads that print messages.
• Instructions:
o Define a class that extends Thread or implements Runnable.
o In the run() method, print a message multiple times.
o Start both threads and observe the output.
*/
class MyThread1 extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 is running: " + i);
            try {
                Thread.sleep(500); // pause for better observation
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread2 extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2 is running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {


        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}