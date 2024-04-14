package Adapter;

import java.util.ArrayList;

public class CityLightsSystem {
    public ArrayList<String> districts = new ArrayList<>();
    public void turnOnLights(LEDLampsDistrict district)
    {
        if (districts.contains(district.districtName) && !district.On)
        {
            district.turnOn();
        }
        else
        {
            System.out.println("can't turn on");
        }
    }
    public void turnOffLights(LEDLampsDistrict district)
    {
        if (districts.contains(district.districtName) && district.On)
        {
            district.turnOff();
        }
        else
        {
            System.out.println("no such district");
        }
    }
}
