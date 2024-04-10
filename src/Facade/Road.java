package Facade;

public class Road {
    String type;
    double length;

    public Road(String type, double length) {
        this.type = type;
        this.length = length;
    }
    public void generate()
    {
        System.out.println(type + " road with length "+length+" was generated");
    }
}
