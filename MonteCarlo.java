package edu.ceu.programming.practices;

import java.util.Random;

public class Practice1 {

    /**
     * Generates an approximation to number PI using the
     * Monte Carlo method. The input parameter `steps` indicate
     * the number of points generated.
     */
    public static double generatePiIterative(long steps) {
        Random random = new Random();
        long insideCircle = 0;

        for (long i = 0; i < steps; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            if (x * x + y * y <= 1) {
                insideCircle++;
            }
        }
        return (4.0 * insideCircle) / steps;
    }
}
