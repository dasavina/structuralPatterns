package Decorator.decorators;
import Decorator.GeneralBuilding;
public class BasementDecorator extends GeneralDecorator {
    public BasementDecorator(GeneralBuilding building) {
        super(building);
    }

    @Override
    public void describe() {
        building.describe();
        System.out.println("this building has a basement");
    }
}
