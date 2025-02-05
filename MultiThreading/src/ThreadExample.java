public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                //code that will run in a new thread

                System.out.println("We are in the new thread: "+ java.lang.Thread.currentThread().getName());
                System.out.println("Current thread priority: "+Thread.currentThread().getPriority());
                throw new RuntimeException("Intentional Message");
            }
        });

        // Thread using lamda expression

        Thread thread1 = new Thread(() -> {


        });

        thread.setName("Misbehaving Thread");
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Current Thread name: "+ java.lang.Thread.currentThread().getName()+" before starting a new thread");
        thread.start();
        System.out.println("Current Thread name: "+ java.lang.Thread.currentThread().getName()+" after starting a new thread");

        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("An unexpected error happened in thread "+t.getName()+" the Error is "+ e.getMessage());
            }
        });
        java.lang.Thread.sleep(1000);


    }
}
