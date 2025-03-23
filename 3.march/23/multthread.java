public class multthread {
    public static void main(String[] args) {
        // Using Thread class
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("Hello from thread: " + Thread.currentThread().getName());
            }
        };

        // Using Runnable interface
        Runnable runnableTask = () -> {
            System.out.println("Hello from thread: " + Thread.currentThread().getName());
        };
        Thread thread2 = new Thread(runnableTask);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
