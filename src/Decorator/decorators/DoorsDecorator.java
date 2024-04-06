package Decorator.decorators;
import Decorator.GeneralBuilding;
public class DoorsDecorator extends GeneralDecorator {
    public DoorsDecorator(GeneralBuilding building) {
        super(building);
    }

    @Override
    public void describe() {
        building.describe();
        System.out.println("This building has doors");
    }
}
