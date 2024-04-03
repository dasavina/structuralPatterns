import Decorator.*;
import Decorator.decorators.*;
import Decorator.factory.BuildingDecorating;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        useDecoratorPattern();
    }

    public static void useDecoratorPattern()
    {
        GeneralBuilding building1 = new Building();
        GeneralBuilding building2 = new Building();

        GeneralBuilding building = new Building();

        System.out.println("оберіть властивості: " +
                "\n(1) Багатоповерховий" +
                "\n(2) Має двері" +
                "\n(3) Має вікна" +
                "\n(4) Має горище" +
                "\n(5) Має підвал" +
                "\nвведення чисел через пропуск");
        Scanner scanner = new Scanner(System.in);
        String[] instructions = scanner.nextLine().split(" ");
        BuildingDecorating decorator = new BuildingDecorating();
        building = decorator.decorate(building, instructions);
        building.describe();


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