package Facade;

public class Building {
    String name;


    public Building(String name) {
        this.name = name;
    }
    public void generate()
    {
        System.out.println("building "+name + " was generated ");
    }
}
