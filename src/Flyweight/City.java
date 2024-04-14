package Flyweight;

import java.util.HashMap;

public class City {

    private static final HashMap map = new HashMap();

    public static GeneralBuilding getBuilding(String type) {
        Building building = (Building)map.get(type);

        if(building == null) {
            building = new Building(type);
            map.put(type, building);
            System.out.println("Creating Building of type : " + type);
        }
        return building;
    }
}
