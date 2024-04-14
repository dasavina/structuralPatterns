import java.util.Scanner;

import Adapter.Adapter;
import Adapter.CityLightsSystem;
import Adapter.IncandescentLampsDistrict;
import Adapter.LEDLampsDistrict;
import Bridge.generator.Generator;
import Facade.City;
import Flyweight.Building;
import Proxy.renderMap.Map;

public class Main {
    public static void main(String[] args) {
        useDecoratorPattern();
        useBridgePattern();
        useProxyPattern();
        useFacadePattern();
        useCompositePattern();
        useAdapterPattern();
        useFlyweightPattern();
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

    public static  void useAdapterPattern()
    {
        LEDLampsDistrict changedLamps = new LEDLampsDistrict("district1");
        IncandescentLampsDistrict oldLamps = new IncandescentLampsDistrict(2);
        CityLightsSystem system = new CityLightsSystem();
        system.districts.add("district1");
        system.districts.add("2");
        Adapter adapter = new Adapter(oldLamps);
        system.turnOnLights(changedLamps);
        system.turnOnLights(adapter);
        system.turnOffLights(adapter);
        system.turnOffLights(changedLamps);
    }

    public static void useFlyweightPattern()
    {
        String type1 = "school";
        String type2 = "shop";
        int year1 = 2022;
        int year2 = 1995;
        Building building1 = (Building)Flyweight.City.getBuilding(type1);
        building1.setYear(year1);
        building1.describe();
        Building building2 = (Building)Flyweight.City.getBuilding(type2);
        building2.setYear(year2);
        building2.describe();
        Building building3 = (Building)Flyweight.City.getBuilding(type1);
        building3.setYear(year2);
        building3.describe();
//
//        building1.describe();
//        building2.describe();
//        building3.describe();

    }

}