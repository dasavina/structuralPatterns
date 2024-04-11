package Composite.generator;

import Composite.*;

import java.util.Random;

public class CompositeGenerator {
    public static Quarter generate(int bound, int depthLimit) {
        Random random = new Random();
        int iterationCount = random.nextInt(1, bound);

        Quarter quarters = new Quarter();

        if (depthLimit <= 0) {
            return quarters;
        }

        for (int i = 0; i < iterationCount; i++) {
            System.out.println("depthLimit: " + depthLimit);
            int bool = random.nextInt(1, 3);

            if (bool == 1) {
                LivingQuarters flat = new Flat(random.nextInt(1, 4));
                quarters.Add(flat);
                System.out.println("flat with " + flat.count()+ " people added");
            } else {
                System.out.println("quarters added");
                // Recursive call with reduced depth limit
                quarters.Add(generate(2, depthLimit - 1));

            }
        }

        return quarters;
    }

}
