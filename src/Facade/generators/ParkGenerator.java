package Facade.generators;

import java.util.Random;

public class ParkGenerator {
    private static final String[] types = {"..", " ", "."};

    public static String generateType() {
        Random random = new Random();
        int index = random.nextInt(types.length);
        return types[index];
    }
    public static int generateArea()
    {
        Random random = new Random();
       return random.nextInt(5, 50);
    }
}
