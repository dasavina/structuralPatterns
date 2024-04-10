package Facade;

public class Park {
    String type;
    double area;

    public Park(String type, double area) {
        this.type = type;
        this.area = area;
    }

    public void generate()
    {
        System.out.println(type + " park with area " + area+ " was generated");

    }
}
