package Document_Processing_Task;

import java.util.concurrent.*;

public class DocumentProcessing {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        System.out.println("Processing is starting in the background!");

        Callable<Integer> processDoc = () -> {
            System.out.println("Processing document...");
            Thread.sleep(2000);
            return 12;
        };

        Future<Integer> future = executorService.submit(processDoc);
        System.out.println("Result: " + future.get());
        executorService.shutdown();
    }
}
