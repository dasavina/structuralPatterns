package Decorator.decorators;
import Decorator.GeneralBuilding;
public class AtticDecorator extends GeneralDecorator {
    public AtticDecorator(GeneralBuilding building) {
        super(building);
    }

    @Override
    public void describe() {
        building.describe();
        System.out.println("this building has an attic");
    }
}
