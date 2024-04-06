package Decorator.decorators;
import Decorator.GeneralBuilding;
public abstract class GeneralDecorator implements GeneralBuilding {
    GeneralBuilding building;

    public GeneralDecorator(GeneralBuilding building) {
        this.building = building;
    }
}
