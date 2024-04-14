package Adapter;

public class LEDLampsDistrict {
    String districtName;
    boolean On;

    public LEDLampsDistrict() {
    }

    public LEDLampsDistrict(String districtName) {
        this.districtName = districtName;
    }

    public void turnOn()
    {
        On=true;
        System.out.println("lamps in district "+districtName+" were turned on");
    }
    public void turnOff()
    {
        On = false;
        System.out.println("lamps in district "+districtName+" were turned off");
    }
}
