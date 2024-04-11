import java.util.Scanner;
import Bridge.generator.Generator;
import Facade.City;
import Proxy.renderMap.Map;

public class Main {
    public static void main(String[] args) {
//        useDecoratorPattern();
//        useBridgePattern();
//        useProxyPattern();
//        useFacadePattern();
        useCompositePattern();
    }

    public static void useDecoratorPattern()
    {
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
        Map map = new Map();
        map.renderWithoutProxy();
        System.out.println("----------------------------------------------");
        map.renderWithProxy();
    }

    public static void useFacadePattern()
    {
        City city = new City();
        city.generateCity();
    }

    public static void useCompositePattern()
    {
        int sum = Composite.generator.CompositeGenerator.generate(4, 5).count();
        System.out.println("People living in this quarters: " + sum);
    }
}