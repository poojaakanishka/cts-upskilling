/*
41. Executor Service and Callable
• Objective: Use concurrency utilities.
• Task: Execute multiple Callable tasks that return results.
• Instructions:
o Use Executors.newFixedThreadPool() and submit() to execute callables.
o Collect results using Future.get().
*/
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<String> {

    private int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public String call() throws Exception {

        Thread.sleep(500);

        return "Task " + taskId + " executed by " +
                Thread.currentThread().getName();
    }
}

public class ExecutorCallableDemo {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<String> f1 = executor.submit(new Task(1));
        Future<String> f2 = executor.submit(new Task(2));
        Future<String> f3 = executor.submit(new Task(3));
        Future<String> f4 = executor.submit(new Task(4));
        Future<String> f5 = executor.submit(new Task(5));

        try {
  
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());
            System.out.println(f5.get());

        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        executor.shutdown();
    }
}