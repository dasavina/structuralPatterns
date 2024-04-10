package Flyweight;

public class City {
    public void buildCity(int amount)
    {
        for (int i = 0; i < amount; i++) {
            Building building = new Building();
            building.draw();
        }
    }
}
