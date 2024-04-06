package Proxy;

public class Proxy {
    DistantCity distantCity;
    public void renderMap()
    {
        if (distantCity == null)
        {
            distantCity = new DistantCity();
        }
        distantCity.renderMap();
    }

}
