package Composite;

public class Flat implements LivingQuarters{
    int numberOfPeople;

    public Flat(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public int count() {
        return numberOfPeople;
    }
}
