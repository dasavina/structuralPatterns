package Proxy;

public abstract class City {
    public City() {
        System.out.println("object created");
    }

    public void renderMap()
    {
        System.out.println("rendering...");
        System.out.println("<city map appears>");
    }

}
