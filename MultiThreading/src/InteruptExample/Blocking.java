package InteruptExample;

public class Blocking implements Runnable{

    public static void main(String[] args) {
        Thread thread=new Thread(new Blocking());
        thread.start();
        thread.interrupt();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            System.out.println("Exiting the blocking thread");

        }
    }
}
