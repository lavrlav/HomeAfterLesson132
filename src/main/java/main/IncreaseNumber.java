package main;

public class IncreaseNumber implements Runnable {
    private NumberStorage number;

    public IncreaseNumber(NumberStorage number) {
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (number) {
            number.incrementNumber();
            number.notifyAll();

        }
        System.out.printf("Increasing number by 10:  %s  %d  %n", Thread.currentThread().getName(), number.getI());
    }
}

