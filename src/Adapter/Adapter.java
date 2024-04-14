package Adapter;

public class Adapter extends LEDLampsDistrict{
    IncandescentLampsDistrict district;

    public Adapter(IncandescentLampsDistrict district) {
        this.district = district;
        districtName = Integer.toString(district.districtID);
    }

    @Override
    public void turnOn() {
        On = district.turnOn();
    }

    @Override
    public void turnOff() {
        On = district.turnOff();
    }
}
