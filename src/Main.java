import Decorator.*;
import Decorator.decorators.*;

public class Main {
    public static void main(String[] args) {
        useDecoratorPattern();
    }

    public static void useDecoratorPattern()
    {
        GeneralBuilding building1 = new Building();
        GeneralBuilding building2 = new Building();

        System.out.println("building1:");
        building1 = new DoorsDecorator(building1);
        building1 = new WindowsDecorator(building1);
        building1.describe();

        System.out.println("building2");
        building2 = new DoorsDecorator(building2);
        building2 = new WindowsDecorator(building2);
        building2 = new BasementDecorator(building2);
        building2 = new FloorsDecorator(building2);
        building2.describe();
    }
}