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
        System.out.println("doing something in the city");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("teleporting to other city");
        distantCity1.renderMap();
        System.out.println("doing something in the city");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("teleporting to other city");
        distantCity2.renderMap();
    }

    public void renderWithProxy()
    {
        System.out.println("generating map");
        CurrentCity currentCity = new CurrentCity();
        Proxy distantCity1 = new Proxy();
        Proxy distantCity2 = new Proxy();
        System.out.println("rendering map");
        currentCity.renderMap();
        System.out.println("doing something in the city");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("teleporting to other city");
        distantCity1.renderMap();
        System.out.println("doing something in the city");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("teleporting to other city");
        distantCity2.renderMap();
    }
}
