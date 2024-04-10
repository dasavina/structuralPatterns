package Facade;

import java.util.Random;

public class City {
    public void generateCity()
    {
        Random random = new Random();
        int buildingNumber = random.nextInt(5, 20);
        int parkNumber = random.nextInt(1,4);
        int roadNumber= random.nextInt(2,6);

        for (int i = 0; i < buildingNumber; i++) {
            Building building = new Building(Facade.generators.BuildingGenerator.generateRandomName());
            building.generate();
        }
        for (int i = 0; i < parkNumber; i++) {
            Park park = new Park(Facade.generators.ParkGenerator.generateType(), Facade.generators.ParkGenerator.generateArea());
            park.generate();
        }
        for (int i = 0; i < roadNumber; i++) {
            Road road = new Road(Facade.generators.RoadGenerator.generateType(), Facade.generators.RoadGenerator.generateLength());
            road.generate();
        }

        System.out.println("City generated!");
    }
}
