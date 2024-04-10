package Facade.generators;
import java.util.Random;

public class BuildingGenerator {
    private static final String[] types = {"school", "shop", "townhome", "apothecary", "dormitory"};

    public static String generateRandomName() {
        Random random = new Random();
        int index = random.nextInt(types.length);
        return types[index];
    }
}
