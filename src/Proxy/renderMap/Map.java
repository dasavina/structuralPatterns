package Proxy.renderMap;

import Proxy.CurrentCity;
import Proxy.DistantCity;
import Proxy.Proxy;

public class Map {
    public void renderWithoutProxy()
    {
        System.out.println("generating map");
        CurrentCity currentCity = new CurrentCity();
        DistantCity distantCity1 = new DistantCity();
        DistantCity distantCity2 = new DistantCity();
        System.out.println("rendering map");
        currentCity.renderMap();
        distantCity1.renderMap();
        distantCity2.renderMap();
        System.out.println("map rendered");
    }

    public void renderWithProxy()
    {
        System.out.println("generating map");
        CurrentCity currentCity = new CurrentCity();
        Proxy distantCity1 = new Proxy();
        Proxy distantCity2 = new Proxy();
        System.out.println("rendering map");
        currentCity.renderMap();
        distantCity1.renderMap();
        distantCity2.renderMap();
        System.out.println("map rendered");
    }
}
