package Decorator.decorators;
import Decorator.GeneralBuilding;
public class FloorsDecorator extends Decorator{
    public FloorsDecorator(GeneralBuilding building) {
        super(building);
    }

    @Override
    public void describe() {
        building.describe();
        System.out.println("this building has multiple floors");
    }
}
