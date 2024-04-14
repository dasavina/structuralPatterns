package Flyweight;

public class Building implements GeneralBuilding{
    String type;
    int year;

    public Building(String type) {
        this.type = type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void describe() {
        System.out.println("This is the "+type+" built in "+year);
    }
}
