package lab3;

import java.util.Random;

/**
 * The Driver class demonstrates the functionality of the Stats class.
 */
public class Driver {
    public static void main(String[] args) {
        final int VALUES = 10;

        Stats stats = new Stats(VALUES);

        Random random = new Random();

        // Generate random values and add them to Stats.
        for (int i = 0; i < VALUES; i++) {
            stats.addValue(random.nextInt(100));
        }

        // Display the result.
        System.out.println("Numbers stored : ");
        System.out.println(stats);
        System.out.println("Average = " + stats.getAverage());
        System.out.println("Count = " + stats.getCount());
        System.out.println("Total = " + stats.getTotal());
        System.out.println("Minimum value = " + stats.getMinValue());
        System.out.println("Maximum value = " + stats.getMaxValue());
    }
}
