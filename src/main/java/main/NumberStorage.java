package main;

public class NumberStorage {
    private int i;

    public NumberStorage(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public  void incrementNumber() {
        i += 10;
    }

    public  void decrementNumber() {
        i -= 5;
    }
}
