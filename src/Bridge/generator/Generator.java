package Bridge.generator;

import Bridge.buildings.Building;
import Bridge.buildings.CityHall;
import Bridge.buildings.School;
import Bridge.buildings.Theatre;
import Bridge.styles.Barocco;
import Bridge.styles.Eclectic;
import Bridge.styles.Modern;
import Bridge.styles.Style;

public class Generator {
    public static Building generate(String styleName, String buildingType) {
        Style style;
        Building building;

        switch (styleName) {
            case "Eclectic": {
                style = new Eclectic();
            }
            break;
            case "Barocco": {
                style = new Barocco();
            }
            break;
            case "Modern": {
                style = new Modern();
            }
            break;
            default: {
                System.out.println("no such style. Eclectic will be used instead");
                style = new Eclectic();
            }
            break;
        }

        switch (buildingType) {
            case "City hall": {
                building = new CityHall(style);
            }
            break;
            case "Theatre": {
                building = new Theatre(style);
            }
            break;
            case "School": {
                building = new School(style);
            }
            break;
            default: {
                System.out.println("no such type. school will be used instead");
                building = new School(style);
            }

        }

        return building;
    }

}
