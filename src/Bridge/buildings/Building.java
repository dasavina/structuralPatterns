package Bridge.buildings;

import Bridge.styles.Style;

public abstract class Building {
    public Building(Style style) {
        this.style = style;
        this.type = getClass().getSimpleName();
    }

    Style style;
    String type;
    public void getDescription()
    {
        System.out.println("This is the " + type + " built in " + style.getStyle() + " style");
    }
}
