package Proxy;

public class DistantCity extends City {
    public DistantCity() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
