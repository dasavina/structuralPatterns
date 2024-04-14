package Adapter;

public class IncandescentLampsDistrict {
    int districtID;

    public IncandescentLampsDistrict(int districtID) {
        this.districtID = districtID;
    }

    public boolean turnOn()
    {
        System.out.println("lamps in district "+districtID+" were turned on");
        return true;
    }

    public boolean turnOff()
    {
        System.out.println("lamps in district "+districtID+" were turned off");
        return false;
    }
}

