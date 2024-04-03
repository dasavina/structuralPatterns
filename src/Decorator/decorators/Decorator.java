package Decorator.decorators;
import Decorator.GeneralBuilding;
public abstract class Decorator implements GeneralBuilding {
    GeneralBuilding building;

    public Decorator(GeneralBuilding building) {
        this.building = building;
    }
}
