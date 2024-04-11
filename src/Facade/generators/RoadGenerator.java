package Facade.generators;

import java.util.Random;

public class RoadGenerator {

    private static final String[] types = {"highway", "main", "side"};

    public static String generateType() {
        Random random = new Random();
        int index = random.nextInt(types.length);
        return types[index];
    }
    public static int generateLength()
    {
        Random random = new Random();
        return random.nextInt(5,70);
    }
}
