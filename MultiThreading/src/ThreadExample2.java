import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadExample2 extends Thread {



    public static final int MAX_PASSWORD = 9999;
    public static void main(String[] args) {

        Random random=new Random();

        Vault vault=new Vault(random.nextInt(MAX_PASSWORD));

        List<Thread> threadList= new ArrayList<>();
        threadList.add(new AscesndingHackerThread(vault));
        threadList.add(new DescendingHackerThread(vault));
        threadList.add(new PoliceThread());

        for (Thread thread:threadList)
        {
            thread.start();
        }

    }

    private static class Vault {

        private final int pass;

        public Vault(int pass) {
            this.pass = pass;

        }

        public boolean isCorrectPassword(int guess)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return this.pass==guess;
        }


    }

    private static abstract class HackerThread extends Thread{

        protected Vault vault;

        public HackerThread(Vault vault)
        {
            this.vault=vault;
            this.setName(this.getClass().getSimpleName());
            this.setPriority(Thread.MAX_PRIORITY);
        }

        @Override
        public void start(){
            System.out.println("Starting thread: "+ this.getName());
            super.start();
        }
    }

    private static class AscesndingHackerThread extends HackerThread{

        public AscesndingHackerThread(Vault vault) {
            super(vault);
        }

        @Override
        public void run(){

            for (int guess=0; guess<MAX_PASSWORD;guess++){
                if (vault.isCorrectPassword(guess)) {
                    System.out.println(this.getName()+" guessed the password "+guess);
                    System.exit(0);
                }
            }
        }
    }

    private static class DescendingHackerThread extends HackerThread{
        public DescendingHackerThread(Vault vault) {
            super(vault);
        }
        @Override
        public void run(){
            for(int guess=MAX_PASSWORD;guess>0;guess--)
            {
                if(vault.isCorrectPassword(guess)){
                    System.out.println(this.getName()+ " guessed the password "+guess);
                }
            }
        }
    }

    private static class PoliceThread extends Thread{
        @Override
        public void run()
        {
            for(int i=10;i>0;i--)
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
            System.out.println("Game over for you hackers ");
            System.exit(0);
        }
    }
}
