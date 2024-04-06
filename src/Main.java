import java.util.Scanner;

import Bridge.buildings.Building;
import Bridge.buildings.Theatre;
import Bridge.generator.Generator;
import Bridge.styles.Eclectic;
import Bridge.styles.Style;
import Decorator.decorators.*;

public class Main {
    public static void main(String[] args) {
        useDecoratorPattern();
        useBridgePattern();
    }

    public static void useDecoratorPattern()
    {
        Decorator.GeneralBuilding building1 = new Decorator.Building();
        Decorator.GeneralBuilding building2 = new Decorator.Building();

        Decorator.GeneralBuilding building = new Decorator.Building();

        System.out.println("""
                оберіть властивості:
                (1) Багатоповерховий
                (2) Має двері
                (3) Має вікна
                (4) Має горище
                (5) Має підвал
                введення чисел через пропуск""");
        Scanner scanner = new Scanner(System.in);
        String[] instructions = scanner.nextLine().split(" ");
        Decorator.factory.BuildingDecorating decorator = new Decorator.factory.BuildingDecorating();
        building = decorator.decorate(building, instructions);
        building.describe();
    }
    public static void useBridgePattern()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть тип будови");
        String buildingType = scanner.nextLine();
        System.out.println("введіть стиль");
        String styleName = scanner.nextLine();
        Generator.generate(styleName, buildingType).getDescription();

    }

    public static void useProxyPattern()
    {

    }
}