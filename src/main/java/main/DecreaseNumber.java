package main;

public class DecreaseNumber implements Runnable {
    private NumberStorage number;

    public DecreaseNumber(NumberStorage number) {
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (number) {
            while (number.getI() != 10){
                try {
                    number.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }number.decrementNumber();

        }
        System.out.printf("Decreasing number by 5: %s %d %n", Thread.currentThread().getName(), number.getI());
    }
}

