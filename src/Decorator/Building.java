package Decorator;

public class Building implements GeneralBuilding{

    @Override
    public void describe() {
        System.out.println("This is a building");
    }
}
