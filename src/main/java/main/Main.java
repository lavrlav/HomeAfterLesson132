package main;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NumberStorage numberStorage = new NumberStorage(0);

        Thread decreasingThread = new Thread(new DecreaseNumber(numberStorage));

        Thread increasingThread = new Thread(new IncreaseNumber(numberStorage));


        decreasingThread.start();
        increasingThread.start();

        decreasingThread.join();
        increasingThread.join();

    }
}
