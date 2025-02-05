package InteruptExample;

import java.math.BigInteger;

public class LongComputationTask implements Runnable {
    private BigInteger base;
    private BigInteger power;

    public LongComputationTask(BigInteger base, BigInteger power) {
        this.base = base;
        this.power = power;
    }

    @Override
    public void run() {

        System.out.println(base + "^"+ power + "= " + pow(base, power));

    }

    private BigInteger pow(BigInteger base, BigInteger power) {

        BigInteger res = BigInteger.ONE;

        for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)) {
//            if(Thread.currentThread().isInterrupted())
//            {
//                System.out.println("Prematurely Interrupted computation");
//                return BigInteger.ZERO;
//            }

            res = res.multiply(base);
        }

        return res;
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new LongComputationTask(new BigInteger("200000000"), new BigInteger("40000000000000")));
        thread.setDaemon(true);
        thread.start();
        thread.interrupt();
    }

}
