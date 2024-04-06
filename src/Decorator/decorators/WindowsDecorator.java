package Decorator.decorators;
import Decorator.GeneralBuilding;
public class WindowsDecorator extends GeneralDecorator {
    public WindowsDecorator(GeneralBuilding building) {
        super(building);
    }

    @Override
    public void describe() {
        building.describe();
        System.out.println("this building has windows");
    }
}
