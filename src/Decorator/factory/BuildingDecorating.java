package Decorator.factory;

import Decorator.GeneralBuilding;
import Decorator.decorators.*;

public class BuildingDecorating {

    public GeneralBuilding decorate(GeneralBuilding building, String[] instructions)
    {

        for (String instruction: instructions)
        {
            switch (instruction)
            {
                case "1" : {building = new FloorsDecorator(building);} break;
                case "2" : {building = new DoorsDecorator(building);} break;
                case "3" : {building= new WindowsDecorator(building);}break;
                case "4" : {building = new AtticDecorator(building);}break;
                case "5" : {building = new BasementDecorator(building);}break;
            }
        }
        return building;

    }

}
